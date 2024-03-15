import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int map[][] = new int[n][2];
        for(int i=0;i<n;i++){

            String[]inputStrArr = br.readLine().split(" ");
            map[i][0] = Integer.parseInt(inputStrArr[0]);
            map[i][1] = Integer.parseInt(inputStrArr[1]);

        }
        if(n==1){
            System.out.println(0);
            return;
        }
        int answer = n;
        int answerList[] = new int[n];
        for(int i=0;i<n;i++){
            int starti = map[i][0];
            int endi = map[i][1];
            for(int j= 0;j<n;j++){
                if(starti>map[j][0] && endi<map[j][1]){
                    answerList[i] = 1;
                    answerList[j] = 1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(answerList[i]>0){
                answer--;
            }
        }
        System.out.println(answer);


        // 여기에 코드를 작성해주세요.
    }
}