import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int map[][] = new int[n][n];

        for(int i=0;i<n;i++){

            String[] inputStrArr = br.readLine().split(" ");
            for(int j=0;j<n;j++){

                map[i][j] = Integer.parseInt(inputStrArr[j]);
            }
        }

        //하나 자리 정해두고 하는 이동하면서 총합을 더한느식으로 해서 가장큰값

        int max = -1;

        int checkmap[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n-2;j++){
                //하나자리정하기
                int firstSum = map[i][j]+map[i][j+1]+map[i][j+2];
                checkmap[i][j]= -1;
                checkmap[i][j+1] = -1;
                checkmap[i][j+2] = -1;
                for(int k =0;k<n;k++){
                    for (int r = 0;r<n-2;r++){

                        if(checkmap[k][r]== -1 || checkmap[k][r+1] ==-1 || checkmap[k][r+2]==-1){
                            continue;
                        }
                        int lastSum = map[k][r]+map[k][r+1]+map[k][r+2];
                        max = Math.max(firstSum+lastSum,max);
                    }
                }
                checkmap[i][j]= 0;
                checkmap[i][j+1] = 0;
                checkmap[i][j+2] = 0;
            }
        }
        System.out.println(max);
    }
}