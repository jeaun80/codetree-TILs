import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        String[]inputStrArr = br.readLine().split(" ");
        int n = Integer.parseInt(inputStrArr[0]);
        int target = Integer.parseInt(inputStrArr[1]);

        String[]inputListArr = br.readLine().split(" ");

        int []map = new int[n];
        for(int i=0;i<inputListArr.length;i++){
            map[i] = Integer.parseInt(inputListArr[i]);
        }



        int Max = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sum = 0;
                for(int r= 0;r<n;r++){

                    if(r==i || r==j){
                        continue;
                    }
                    sum+=map[r];
                }

                Max = Math.min(Max, Math.abs(target-sum));
            }
        }

        System.out.println(Max);
    }
}