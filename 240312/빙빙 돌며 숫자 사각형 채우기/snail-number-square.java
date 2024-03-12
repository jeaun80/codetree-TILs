import java.util.*;
import java.io.*;

public class Main {

    static int dx[] = {0,1,0,-1};
    static int dy[] = {1,0,-1,0};

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]inputStrArr = br.readLine().split(" ");

        int n = Integer.parseInt(inputStrArr[0]);
        int m = Integer.parseInt(inputStrArr[1]);

        int map[][] = new int[n][m];
        int x = 0;
        int y = 0;
        int dir =0;
        map[x][y] = 1;
        int cnt =1;

        while(cnt!=(n*m)){
            
            int nx = x+dx[dir];
            int ny = y+dy[dir];

            if(nx>=0 && ny>=0 && nx<n && ny<m && map[nx][ny]==0){
                x = nx;
                y = ny;
                map[x][y] = ++cnt;
                //System.out.print("k");
            }
            else{
                dir= (dir+5)%4;
            }

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }



        
        // 여기에 코드를 작성해주세요.
    }
}