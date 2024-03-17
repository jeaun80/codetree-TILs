import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[]inputStrSizeArr = br.readLine().split(" ");


        int n = Integer.parseInt(inputStrSizeArr[0]);
        int k = Integer.parseInt(inputStrSizeArr[1]);
        int map[][] = new int[n][k];

        for(int i=0;i<n;i++){
            String[]inputStrArr = br.readLine().split(" ");

            for(int j=0;j<k;j++){
                map[i][j] = Integer.parseInt(inputStrArr[j]);
            }
        }

        int answer = 0;
        for(int i=1;i<=k;i++){// i = 첫번째 순서쌍
            int first = i;
            for(int j=1;j<=k;j++){// 두번째순서쌍
                int second = j; 
                if(first==second){
                    continue;
                }
                boolean flag = false;
                for(int a = 0;a<n;a++){//n번경기 전부 검사
                    int findex = 0;
                    int sindex = 0;
                    for(int b = 0;b<k;b++){
                        if(map[a][b]==first){
                            findex = b;
                        }
                        if(map[a][b]==second){
                            sindex = b;
                        }
                    }
                    if(findex<sindex){
                        continue;
                    }
                    else{
                        flag = true;
                        break;
                    }

                }
                if(!flag){
                    answer++;
                }
            }
        }
        System.out.println(answer);


        

        



        // 여기에 코드를 작성해주세요.
    }
}