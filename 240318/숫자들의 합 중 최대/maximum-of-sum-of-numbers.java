import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[]inputStrArr= br.readLine().split(" ");


        int a = Integer.parseInt(inputStrArr[0]);
        int b = Integer.parseInt(inputStrArr[1]);

        String AstrArr[] = String.valueOf(a).split("");
        String BstrArr[] = String.valueOf(b).split("");

        int asum =0;
        int bsum =0;
        for(String i : AstrArr){
            asum+=Integer.parseInt(i);
        }

        for(String i : BstrArr){
            bsum+=Integer.parseInt(i);
        }
        int answer = Math.max(asum,bsum);
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}