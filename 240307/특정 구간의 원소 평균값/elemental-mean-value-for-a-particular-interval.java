import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[]inputStrArr = br.readLine().split(" ");
        int[]map = new int[n];
        for(int i=0;i<n;i++){
            map[i] = Integer.parseInt(inputStrArr[i]);
        }
        
        int answer = 0;
        for(int i=1;i<=n;i++){//구간크기

            for(int j=0;j<n-i+1;j++){//순회
                double midsum =0;
                for(int k=j;k<i+j;k++){
                    midsum +=map[k];
                }
                double mid = midsum/i;
                for(int k=j;k<i+j;k++){
                    if(mid==map[k]){

                        answer++;
                        break;
                    }
                }
            }



        }
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}