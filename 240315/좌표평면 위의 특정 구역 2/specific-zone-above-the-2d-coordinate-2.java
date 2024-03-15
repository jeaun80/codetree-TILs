import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args)  throws IOException{


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        int jumlist[][] = new int[n][2];


        for(int i=0;i<n;i++){

            String[]inputStrArr = br.readLine().split(" ");

            jumlist[i][0] = Integer.parseInt(inputStrArr[0]);
            jumlist[i][1] = Integer.parseInt(inputStrArr[1]);
        }

        int answer =Integer.MAX_VALUE;

        //사각형 넓이구하기

            //제외점 선택 
        for(int i=0;i<n;i++){

            int minx = Integer.MAX_VALUE;
            int miny = Integer.MAX_VALUE;
            int maxx = 0;
            int maxy = 0;
            //제외하고 전체반복
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                int curx = jumlist[j][0];
                int cury = jumlist[j][1];

                maxx = Math.max(curx,maxx);
                maxy = Math.max(cury,maxy);
                minx = Math.min(curx,minx);
                miny = Math.min(cury,miny);
            }
            answer = Math.min(answer,(Math.abs(minx-maxx))*(Math.abs(miny-maxy)));
            
        }
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}