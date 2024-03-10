import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int map[][] = new int[n][2];

        for(int i=0;i<n;i++){

            String[] inputStrArr = br.readLine().split(" ");

            map[i][0] = Integer.parseInt(inputStrArr[0]);
            map[i][1] = Integer.parseInt(inputStrArr[1]);
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int ix = map[i][0];
            int iy = map[i][1];
            for(int j =i+1;j<n;j++){
                
                int distance = Math.abs(ix-map[j][0])* Math.abs(ix-map[j][0]) + Math.abs(iy-map[j][1])*Math.abs(iy-map[j][1]);


                min = Math.min(distance,min);
            }
        }
        System.out.println(min);
        // 여기에 코드를 작성해주세요.
    }
}