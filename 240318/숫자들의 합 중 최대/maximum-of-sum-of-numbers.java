import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[]inputStrArr= br.readLine().split(" ");


        int a = Integer.parseInt(inputStrArr[0]);
        int b = Integer.parseInt(inputStrArr[1]);

        int answer = 0;

        for(int i = a;i<=b;i++){
            int sum = 0;
            String AstrArr[] = String.valueOf(i).split("");
            for(String s : AstrArr){
                sum+=Integer.parseInt(s);
            }
            answer = Math.max(sum,answer);
        }
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}