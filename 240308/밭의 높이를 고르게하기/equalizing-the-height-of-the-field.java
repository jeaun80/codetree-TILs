import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputStrArr = br.readLine().split(" ");

        int n = Integer.parseInt(inputStrArr[0]);
        int h = Integer.parseInt(inputStrArr[1]);
        int t = Integer.parseInt(inputStrArr[2]);

        String[] inputMapArr = br.readLine().split(" ");
        int map[] = new int[n];
        for(int i=0;i<n;i++){
            map[i] = Integer.parseInt(inputMapArr[i]);
        }

        int answer = Integer.MAX_VALUE;
        for(int i = 0;i <= n-t;i++){
            int sum =0;
            for(int j = 0;j < t;j++){

                sum+=Math.abs(map[j+i]-h);
            }
            answer = Math.min(sum,answer);
        }
        System.out.println(answer);
    }
}