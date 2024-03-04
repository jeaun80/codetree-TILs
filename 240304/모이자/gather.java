import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int personArr[] = new int[n];

        String []inputArr = br.readLine().split(" ");
        
        for(int i=0;i<n;i++){
            personArr[i] = Integer.parseInt(inputArr[i]);
        }
        int answer =9999999;
        for(int i=0;i<n;i++){

            int curHome = i;
            int midAnswer = 0;
            for(int j=0;j<n;j++){
                int diff = Math.abs(curHome-j);
                midAnswer += diff*personArr[j];
            }
            answer = Math.min(answer,midAnswer);
        }
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}