import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        String[]inputStrArr = br.readLine().split(" ");

        int[]inputArr = new int[inputStrArr.length];

        for(int i=0;i<inputStrArr.length;i++){
            inputArr[i] = Integer.parseInt(inputStrArr[i]);
        }
        int answer = 0;
        for(int i=0;i<inputArr.length-2;i++){
            int midanswer = 0;
            for(int j=i+1;j<inputArr.length;j++){
                midanswer= inputArr[i]+inputArr[j];
                answer = Math.max(midanswer,answer);
            }

        }
        // 여기에 코드를 작성해주세요.
        System.out.println(answer);
    }
}