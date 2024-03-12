import java.util.*;
import java.io.*;


public class Main {

    static int dx[] = {0,1,0,-1};
    static int dy[] = {1,0,-1,0};

    static int gx[] = {0,0,1,2};
    static int gy[] = {1,2,0,0};


    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]inputStrSizeArr = br.readLine().split(" ");
        int n = Integer.parseInt(inputStrSizeArr[0]);
        int m = Integer.parseInt(inputStrSizeArr[1]);

        int map[][] = new int[n][m];


        for(int i=0;i<n;i++){
            String[]inputStrArr = br.readLine().split(" ");
            for(int j=0;j<m;j++){
                map[i][j] = Integer.parseInt(inputStrArr[j]);
            }
        }
        int answer = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                for(int r=0;r<4;r++){
                    boolean flag = true;
                    int midsum=map[i][j];
                    for(int k = 0;k<2;k++){
                        int index = (r+k)%4;
                        int nx = i+dx[index];
                        int ny = j+dy[index];
                        if(nx>=0 && ny>=0 && nx<n && ny<m){
                            midsum+=map[nx][ny];
                        }
                        else{
                            flag =false;
                            break;
                        }
                    }
                    if(flag){
                        answer = Math.max(midsum,answer);
                    }
                }

                for(int r=0;r<2;r++){
                    int midsum=map[i][j];
                    boolean flag = true;
                    int index =0;
                    for(int k = 0;k<2;k++){
                        if(r==1){
                            index=r+k+1;
                        }
                        else{
                            index=k;
                        }
                        int nx = i+gx[index];
                        int ny = j+gy[index];
                        //System.out.println("범위 안 r = "+r+ " "+i+" "+j+" index = "+index+" nx = "+nx+" ny = "+ny);

                        if(nx>=0 && ny>=0 && nx<n && ny<m){

                            midsum+=map[nx][ny];
                        }
                        else{
                            //System.out.println(i+" "+j+" index = "+index);
                            flag =false;
                            break;
                        }
                    }
                    if(flag){
                        answer = Math.max(midsum,answer);
                    }
                }
                //System.out.println(i+ " "+j+ " "+ answer);
                
            }
        }

        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}