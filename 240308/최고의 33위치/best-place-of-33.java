import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int map[][]= new int[n][n];

        for(int i=0;i<n;i++){

            String[]inputMapArr = br.readLine().split(" ");

            for(int j=0;j<n;j++){
                map[i][j] = Integer.parseInt(inputMapArr[j]);
            } 
        }
        int answer =0;

        for(int i=0;i<=n-3;i++){
            for(int j=0;j<=n-3;j++){
                int sum = 0;
                for(int k=i;k<i+3;k++){
                    for(int r=j;r<j+3;r++){
                        sum+=map[k][r];
                    }
                }
                answer = Math.max(sum,answer);
            }

        }
        
        System.out.println(answer);        // 여기에 코드를 작성해주세요.
    }
}