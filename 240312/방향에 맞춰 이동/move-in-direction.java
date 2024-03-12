import java.util.*;
import java.io.*;

public class Main {
    static int dx[] = {0,-1,1,0};
    static int dy[] = {-1,0,0,1};
    public static void main(String[] args) throws IOException {


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        int n= Integer.parseInt(br.readLine());
        String[]dirArr = new String[n];
        int[]distanceArr = new int[n];

        int map[][] = new int[101][101];
        for(int i=0;i<n;i++){


            String[]inputStrArr = br.readLine().split(" ");

            dirArr[i] = inputStrArr[0];
            distanceArr[i] = Integer.parseInt(inputStrArr[1]);
         }
         int x =0;
         int y = 0;

        for(int i=0;i<n;i++){
            int nx = 0;
            int ny = 0;
            if(dirArr[i].equals("W")){
                nx = x+dx[0]*distanceArr[i];
                ny = y+dy[0]*distanceArr[i];
            }
            else if(dirArr[i].equals("S")){

                nx = x+dx[1]*distanceArr[i];
                ny = y+dy[1]*distanceArr[i];
            }
            else if(dirArr[i].equals("N")){

                nx = x+dx[2]*distanceArr[i];
                ny = y+dy[2]*distanceArr[i];
            }
            
            else if(dirArr[i].equals("E")){

                nx = x+dx[3]*distanceArr[i];
                ny = y+dy[3]*distanceArr[i];
            }

            if(nx>=0 && ny>=0 && nx<101 && ny<101){
                
                x = nx;
                y = ny;

            }
        }
        System.out.println(y+" "+x);
        // 여기에 코드를 작성해주세요.
    }
}