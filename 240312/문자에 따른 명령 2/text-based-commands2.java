import java.util.*;
import java.io.*;

public class Main {

    static int dx[] = {-1,0,1,0};
    static int dy[] = {0,1,0,-1};
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String []commandArr = br.readLine().split("");
        int n = commandArr.length;
        int x= 0;
        int y = 0;
        int dir = 0;
        for(int i=0;i<n;i++){

            if(commandArr[i].equals("R")){
                dir++;
                if(dir==4){
                    dir = 0;
                }
            }
            else if(commandArr[i].equals("L")){
                dir--;
                if(dir<0){
                    dir = 3;
                }
            }
            else if(commandArr[i].equals("F")){
                //System.out.println(dir);
                x+= dx[dir];
                y+= dy[dir];
            }
            
        }
        System.out.println(y+" "+x);

        // 여기에 코드를 작성해주세요.
    }
}