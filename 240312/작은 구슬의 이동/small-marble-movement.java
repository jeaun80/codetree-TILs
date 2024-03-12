import java.util.*;
import java.io.*;

public class Main {

    static int dx[] = {-1,0,1,0};
    static int dy[] = {0,1,0,-1};

    public static void main(String[] args)  throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] inputStrArr = br.readLine().split(" ");

        int n = Integer.parseInt(inputStrArr[0]);
        int t = Integer.parseInt(inputStrArr[1]);

        int map[][] = new int[n+1][n+1];

        inputStrArr = br.readLine().split(" ");

        int r = Integer.parseInt(inputStrArr[0]);
        int c = Integer.parseInt(inputStrArr[1]);
        String d = inputStrArr[2];
        int dir =0;
        if(d.equals("U")){
            dir =0;
        }
        else if(d.equals("D")){
            dir = 1;
        }
        else if(d.equals("R")){
            dir = 2;
        }
        else if(d.equals("L")){
            dir =3;
        }
        // 01 상하 23 좌우

        while(t!=0){

            int nx = r+dx[dir];
            int ny = c+dy[dir];
            if(nx>0 && ny>0 && nx<=n&& ny<=n){
                t--;
                r = nx;
                c = ny;
            }
            else{
                t--;
                dir= (dir+2+4)%4;
            }
        }

        System.out.println(r+" "+c);



        

        // 여기에 코드를 작성해주세요.
    }
}