import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] inputStrArr = br.readLine().split(" ");

        int n = Integer.parseInt(inputStrArr[0]);
        int m = Integer.parseInt(inputStrArr[1]);

        int[][]map = new int[n][n];

        for(int i=0;i<n;i++){
            String[] inputMapArr = br.readLine().split(" ");

            for(int j=0;j<n;j++){
                map[i][j] = Integer.parseInt(inputMapArr[j]);
            }
        }
        int answer = 0;
        for(int i=0;i<n;i++){
            int comapreValue = map[i][0];
            int count =1;
            for(int j=1;j<n;j++){
                if(comapreValue==map[i][j]){
                    count++;
                }
                else{
                    count =1;
                    comapreValue = map[i][j];
                }


                if(count>=m){
                    answer++;
                    break;
                }
            }
        }

        for(int i=0;i<n;i++){
            int comapreValue = map[0][i];
            int count =1;
            for(int j=1;j<n;j++){
                if(comapreValue==map[j][i]){
                    count++;
                }
                else{
                    count =1;
                    comapreValue = map[j][i];
                }


                if(count>=m){
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}