import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int checkPoint[][] = new int[n][2];

        for(int i=0;i<n;i++){
            String []strInputArr = br.readLine().split(" ");
            checkPoint[i][0] = Integer.parseInt(strInputArr[0]);
            checkPoint[i][1] = Integer.parseInt(strInputArr[1]);
        }

//총 거리 계산 + 4구역마다의 거리계산
        int distanceMap[] = new int[n];
        int startx = checkPoint[0][0];
        int starty = checkPoint[0][1];
        int distance = 0;
        int answer = Integer.MAX_VALUE;
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n;j++){
                int curMove = 0;
                if(i==j){
                    curMove=  Math.abs(checkPoint[j-1][0]-checkPoint[j+1][0])+Math.abs(checkPoint[j-1][1]-checkPoint[j+1][1]);
                j++;
                }
                else{
                    curMove=  Math.abs(checkPoint[j-1][0]-checkPoint[j][0])+Math.abs(checkPoint[j-1][1]-checkPoint[j][1]);
                }
                distance+= curMove;

            }
            //System.out.println(distance);
            answer = Math.min(distance,answer);
            distance =0;

        }
        System.out.println(answer);
        
        
    }
}