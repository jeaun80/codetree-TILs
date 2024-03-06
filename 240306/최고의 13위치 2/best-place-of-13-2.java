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
        int max =-1;
        int ri = 0;
        int rj = 0;
        int answer =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-2;j++){
                int a1= map[i][j];
                int a2= map[i][j+1];
                int a3= map[i][j+2];

                if(a1== -1 || a2== -1 || a3 ==-1){
                    continue;
                }
                int sum = (a1+a2+a3);
                if(sum>max){
                    max = sum;
                    ri = i;
                    rj = j;
                }
            }
        }
        map[ri][rj] = -1;
        map[ri][rj+1] = -1;
        map[ri][rj+2] = -1;
        answer+=max;
        max = -1;
        ri = 0;
        rj = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-2;j++){
                int a1= map[i][j];
                int a2= map[i][j+1];
                int a3= map[i][j+2];

                if(a1== -1 || a2== -1 || a3 ==-1){
                    continue;
                }
                int sum = (a1+a2+a3);
                if(sum>max){
                    max = sum;
                    ri = i;
                    rj = j;
                }
            }
        }
        answer+=max;
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}