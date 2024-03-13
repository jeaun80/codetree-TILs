import java.io.*;
import java.util.*;


public class Main {

    static int[] dx = {-1,-1,1,1};
    static int[] dy = {1,-1,-1,1};
    public static void main(String[] args) throws IOException {



        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        int [][]map = new int[n][n];


        for(int i=0;i<n;i++){
            String[] inputStrArr = br.readLine().split(" ");
            for(int j=0;j<n;j++){
                map[i][j] = Integer.parseInt(inputStrArr[j]);
            }
        }
        int answer =0;

        for(int i = 2;i<n;i++){
            for(int j= 1;j<n-1;j++){//시작점 밑꼭지점으로 설정, 맵안에서 시작범위 설정
                int midsum = map[i][j];

                int nx =i;
                int ny =j;
                
                int firN = i-j;
                int secN = i-firN;
                if(j==n-2){
                    firN = 1;
                    secN = i-1;
                }
                for(int seci =0;seci<secN;seci++){
                    nx = i;
                    ny = j;
                    midsum =map[i][j];
                    for(int movei = 0;movei<4;movei++){

                        if(movei==0){
                            //System.out.println(firN);
                            for(int r = 0;r<firN;r++){
                                nx +=dx[movei];
                                ny +=dy[movei];
                            // System.out.println("nx = "+nx+" ny = "+ny);

                                midsum+=map[nx][ny];
                            }
                        }
                        if(movei==1){
                            //System.out.println("diss");
                            for(int r= 0;r<secN;r++){
                                nx+=dx[movei];
                                ny+=dy[movei];
                            //  System.out.println("nx = "+nx+" ny = "+ny);
                                midsum+=map[nx][ny];
                            }
                        }
                        if(movei==2){
                            for(int r = 0;r<firN;r++){
                                nx +=dx[movei];
                                ny +=dy[movei];
                                //System.out.println("nx = "+nx+" ny = "+ny);
                                midsum+=map[nx][ny];
                            }

                        }
                        if(movei==3){
                            //System.out.println("dissss");
                            for(int r= 0;r<secN-1;r++){
                                nx+=dx[movei];
                                ny+=dy[movei];
                                midsum+=map[nx][ny];
                            }

                        }
                        if(secN>1){
                            secN--;

                        }
                    }
                    answer = Math.max(midsum,answer);
                    if(i!=n-1){
                        j = n-2;
                        break;
                    }
                }
                
            }
        }
        System.out.println(answer);



        // 여기에 코드를 작성해주세요.
    }
}