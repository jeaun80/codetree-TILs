import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int map[] = new int [1001];
        int maxend = 0;
        int twomap[][] = new int[n][2];
        for(int i=0;i<n;i++){
            
            String[]inputStrArr = br.readLine().split(" ");
            int start = Integer.parseInt(inputStrArr[0]);
            int end = Integer.parseInt(inputStrArr[1]);

            twomap[i][0] = start;
            twomap[i][1] = end;
            for(int j=start;j<end;j++){
                map[j]++;
            }
            maxend = Math.max(end,maxend);
        }
        int answer = 0;

        for(int i=0;i<n;i++){
            int midanswer = maxend;
            int newmap[] = new int[maxend];
            for(int a = 0;a<maxend;a++){
                newmap[a] = map[a];
            }
            for(int j=twomap[i][0];j<twomap[i][1];j++){
                newmap[j]--;
            }
            for(int a=0;a<maxend;a++){
                if(newmap[a]==0){
                    midanswer--;
                }
            }
            answer = Math.max(midanswer,answer);
        }

        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}