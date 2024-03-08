import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sizeStrArr = br.readLine().split(" ");

        int n = Integer.parseInt(sizeStrArr[0]);
        int k = Integer.parseInt(sizeStrArr[1]);
//n이 80 k가 72일때 즉 인덱스가 넘을때 발생 
        int []map = new int[101];
        int answer = 0;

        for(int i=0;i<n;i++){

            String[]inputStrArr = br.readLine().split(" ");
            map[Integer.parseInt(inputStrArr[1])] += Integer.parseInt(inputStrArr[0]);
            answer+=Integer.parseInt(inputStrArr[0]);
        }
        if(k>=51){
            System.out.println(answer);
            return;
        }
        answer=0;
        for(int i=k;i<100;i++){
            int midAnswer =0;
            int nextRange = i+k;
            if(nextRange>100){
                nextRange=100;
            }
            int beforeRange = i-k;
            if(beforeRange<0){
                beforeRange = 0;
            }

            for(int j = beforeRange;j<=nextRange;j++){
                midAnswer+=map[j];
            }
            answer = Math.max(midAnswer,answer);
        }

        System.out.println(answer);


        // 여기에 코드를 작성해주세요.
    }
}