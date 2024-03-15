import java.util.*;
import java.io.*;

public class Main {
    static int map[][];
    public static void main(String[] args) throws IOException{


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String[] inputSizeStrArr = br.readLine().split(" ");

        int n = Integer.parseInt(inputSizeStrArr[0]);
        int m = Integer.parseInt(inputSizeStrArr[1]);

        map = new int[n][m];

        for(int i=0;i<n;i++){
            String[]inputStrArr = br.readLine().split(" ");
            for(int j=0;j<m;j++){

                map[i][j] = Integer.parseInt(inputStrArr[j]);
            }
        }

        
        //시작점찾기

        int answer =-1;
        for(int start_i=0;start_i<n;start_i++){
            for(int start_j=0;start_j<m;start_j++){

                //사각형 사이즈 찾기
                for(int size_i =start_i;size_i<n;size_i++){
                    for(int size_j=start_j;size_j<m;size_j++){
                        int sum =0;
                        //사각형의 양수계산
                        if(size_i>start_i && size_j>start_j){
                            sum = getRactSum(start_i,start_j,size_i,size_j);
                        }
                        if(sum>0){
                            //System.out.println(start_i+" "+start_j+"      "+size_i+" "+size_j);
                            //System.out.println((Math.abs(size_i-start_i)+1)*(Math.abs(size_j-start_j)+1));
                            answer = Math.max(answer, (Math.abs(size_i-start_i)+1)*(Math.abs(size_j-start_j)+1));
                        }
                    }
                }
            }
        }

        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }

    public static int getRactSum(int si,int sj,int fi,int fj){
        int sum = 0;
        for(int i=si;i<=fi;i++){
            for(int j= sj;j<=fj;j++){
                if(map[i][j]>0){
                    sum+=map[i][j];
                }
                else{
                    sum = -1;
                    return sum;
                }
            }
        }
        return sum;

    }
}