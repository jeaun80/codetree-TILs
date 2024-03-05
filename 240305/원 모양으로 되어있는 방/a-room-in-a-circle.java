import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        int roomArr[] = new int[n];

        for(int i=0;i<n;i++){
            roomArr[i] = Integer.parseInt(br.readLine());
        }

        int answer = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){

            int minDistance = 0;
            int move = 0;
            int moveindex = i;
            for(int j=0;j<n;j++){
                if(j==moveindex){
                    move++;
                    continue;
                }
                //System.out.println("i = "+ i+ " move = "+ move +" roomArrValue = "+roomArr[moveindex]+" moveindex ="+moveindex);
                minDistance+=move*roomArr[moveindex];
                move++;
                moveindex++;
                if(moveindex==n){
                    moveindex =0;
                }

            }
            //System.out.println(minDistance);
            answer = Math.min(minDistance,answer);
        }
        System.out.println(answer);
    }
}