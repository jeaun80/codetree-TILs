import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]inputStrArr = br.readLine().split(" ");

        int n = Integer.parseInt(inputStrArr[0]);
        int k = Integer.parseInt(inputStrArr[1]);

        String[]inputMapArr = br.readLine().split(" ");

        int[]map = new int[n];
        for(int i=0;i<inputMapArr.length;i++){
            map[i] = Integer.parseInt(inputMapArr[i]);
        }

        int maxValue = Integer.MIN_VALUE;

        for(int i=0;i<n-k+1;i++){
            int midAnswer = 0;
            for(int j=i;j<i+3;j++){
                midAnswer+=map[j];
            }
            maxValue = Math.max(midAnswer,maxValue);
        }

        System.out.println(maxValue);
        // 여기에 코드를 작성해주세요.
    }
}