import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]inputStrSizeArr = br.readLine().split(" ");

        int N = Integer.parseInt(inputStrSizeArr[0]);
        int LOW = Integer.parseInt(inputStrSizeArr[1]);
        int MID = Integer.parseInt(inputStrSizeArr[2]);
        int HIGH = Integer.parseInt(inputStrSizeArr[3]);

        int map[][] = new int[N][2];

        int minon=Integer.MAX_VALUE;
        int maxon = 0;
        for(int i=0;i<N;i++){
            String[]inputStrArr = br.readLine().split(" ");
            map[i][0] = Integer.parseInt(inputStrArr[0]);
            map[i][1] = Integer.parseInt(inputStrArr[1]);

            minon = Math.min(minon,map[i][0]);
            maxon = Math.max(maxon,map[i][1]);
            
        }
        int answer = 0;
        for(int i=0;i<maxon;i++){

            int ondo = i;
            int sum = 0;
            for(int j=0;j<N;j++){
                if(ondo<map[j][0]){
                    sum+=LOW;
                }
                else if(ondo>=map[j][0] && ondo<=map[j][1]){
                    sum +=MID;
                }
                else{
                    sum +=HIGH;
                }
            }
            answer = Math.max(sum,answer);
        }

        System.out.println(answer);
    }
}