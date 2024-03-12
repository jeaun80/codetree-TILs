import java.util.*;
import java.io.*;

public class Main {

    static int dx[]  = {-1,0,0,1};
    static int dy[] = {0,-1,1,0};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        int map[][] = new int[n][n];

        for(int i=0;i<n;i++){
            String[]inputStrArr = br.readLine().split(" ");
            for(int j=0; j<n;j++){
                map[i][j] = Integer.parseInt(inputStrArr[j]);
            }
        }
        int answer =0;
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                int count=0;
                for(int k=0;k<4;k++){
                    int nx = dx[k]+i;
                    int ny = dy[k]+j;
                    if(nx>=0 && ny>=0 && nx<n && ny<n && map[nx][ny]==1){
                        count++;
                    }
                }
                if(count>=3){
                    answer++;
                }
            }
        }
        System.out.println(answer);
        



        // 여기에 코드를 작성해주세요.
    }
}