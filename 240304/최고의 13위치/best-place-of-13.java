import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int map[][] = new int[n][n];

        for(int i =0 ;i<n;i++){

            String[]inputArr = br.readLine().split(" ");
            for(int j=0;j<inputArr.length;j++){
                map[i][j] = Integer.parseInt(inputArr[j]);
            }
        }
        int answer = 0;

        for(int i=0;i<map.length;i++){
            int Max = Integer.MIN_VALUE;
            for(int j=0;j<map[i].length-2;j++){
                int midMaxVal = 0;
                midMaxVal+= map[i][j]+map[i][j+1]+map[i][j+2];
                Max = Math.max(midMaxVal,Max);  
            }
            answer = Math.max(Max, answer);
        }
    
    System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}