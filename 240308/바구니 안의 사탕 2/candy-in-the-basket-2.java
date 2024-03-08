import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sizeStrArr = br.readLine().split(" ");

        int n = Integer.parseInt(sizeStrArr[0]);
        int k = Integer.parseInt(sizeStrArr[1]);

        int []map = new int[100];
        for(int i=0;i<n;i++){

            String[]inputStrArr = br.readLine().split(" ");
            map[Integer.parseInt(inputStrArr[1])] = Integer.parseInt(inputStrArr[0]);
        }
        int answer = 0;
        for(int i=k;i<99-k;i++){
            int midAnswer =0;
            for(int j = i-k;j<=i+k;j++){
                midAnswer+=map[j];
            }
            answer = Math.max(midAnswer,answer);
        }

        System.out.println(answer);


        // 여기에 코드를 작성해주세요.
    }
}