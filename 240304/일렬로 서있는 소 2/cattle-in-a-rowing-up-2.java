import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] cowArr = new int[n];
        String inputStrArr[] = br.readLine().split(" ");
        
        for(int i=0;i<n;i++){
            cowArr[i] = Integer.parseInt(inputStrArr[i]);
        }


        int answer = 0;
        for(int i=0;i<cowArr.length-2;i++){
            int iVal = cowArr[i];
            for(int j =i+1;j<cowArr.length-1;j++){
                int jVal = cowArr[j];
                for(int k = j+1;k<cowArr.length;k++){
                    int kVal = cowArr[k];
                    if(iVal<=jVal && jVal<=kVal){
                        answer++;
                    }

                }
            }
        }
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}