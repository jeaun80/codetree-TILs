import java.io.*;
import java.util.*;

public class Main {

    public static int MAX_N = 100001;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer>list = new ArrayList<>();

        int[][]map = new int[100001][1];
        int size =0;
        for(int i=0;i<n;i++){

            String[] inputStrArr = br.readLine().split(" ");

            int su = Integer.parseInt(inputStrArr[0]);
            int num = Integer.parseInt(inputStrArr[1]);

            map[num][0] += su;
            size+=su;
        }

        int firCursur = 1;
        int secCursur = MAX_N-1;
        int min =0;

        for(int i=0;i<size/2;i++){
            int fir = 0;
            int sec = 0;
            while(map[firCursur][0]==0){
                firCursur++;
            }
            if(map[firCursur][0]>0){
                // fir = map[firCursur][0];
                map[firCursur][0]--;
            }

            while(map[secCursur][0]==0){
                secCursur--;
            }
            if(map[secCursur][0]>0){
                // sec = map[secCursur][0];
                map[secCursur][0]--;
            }
            int compareMin = firCursur+secCursur;
            // System.out.println(firCursur+" "+secCursur);
            min = Math.max(compareMin,min);
        }
        System.out.println(min);
        // 여기에 코드를 작성해주세요.
    }
}