import java.io.*;
import java.util.*;

public class Main {

    static int mx[] = {1,0,-1,0,1,1,-1,-1};
    static int my[] = {0,1,0,-1,1,-1,1,-1};
    public static void main(String[] args) throws IOException{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        String[] inputSizeStrArr = br.readLine().split(" ");

        int n= Integer.parseInt(inputSizeStrArr[0]);
        int m = Integer.parseInt(inputSizeStrArr[1]);

        String map[][] = new String[n][m];

        for(int i=0;i<n;i++){
            String[]inputStrArr = br.readLine().split("");
            for(int j=0;j<m;j++){
                map[i][j] = inputStrArr[j]; 
            }
        }
        int answer =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j].equals("L")){

                    for(int k=0;k<8;k++){
                        int di = i+mx[k];
                        int dj = j+my[k];

                        int ddi = di+mx[k];
                        int ddj = dj+my[k];


                        if(di<n && di>=0 && dj<m && dj>=0){
                            if(ddi<n && ddi>=0&& ddj<m && ddj>=0){
                                if(map[di][dj].equals("E") && map[ddi][ddj].equals("E")){
                                    answer++;
                                }
                            }
                        }
                    }
                    //8방향체크


                }
            }
        }
        System.out.println(answer);

        // 여기에 코드를 작성해주세요.
    }
}