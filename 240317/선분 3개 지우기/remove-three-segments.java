import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int map[][] = new int[n][2];
        int lineList[] = new int[101];

        for(int i = 0;i<n;i++){

            String[]inputStrArr = br.readLine().split(" ");

            map[i][0] = Integer.parseInt(inputStrArr[0]);
            map[i][1] = Integer.parseInt(inputStrArr[1]);
            for(int j=map[i][0];j<=map[i][1];j++){
                lineList[j]++;
            }
        }

        int answer =0;
        for(int i=0;i<n-2;i++){
            int []copyLineList = new int[101];
            for(int j= i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    boolean flag = false;

                    for(int a=0;a<lineList.length;a++){
                        copyLineList[a] = lineList[a];
                    }

                    for(int b= map[k][0];b<=map[k][1];b++){
                        copyLineList[b]--;
                    }
                    for(int b= map[j][0];b<=map[j][1];b++){
                        copyLineList[b]--;
                    }
                    for(int b= map[i][0];b<=map[i][1];b++){
                        copyLineList[b]--;
                    }
                    for(int a = 0;a<101;a++){
                        if(copyLineList[a]>1){
                            flag = true;
                        }
                    }
                    if(!flag){
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);

        

    }
}