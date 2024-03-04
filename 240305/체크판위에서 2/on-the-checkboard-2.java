import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)  throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] rangeStrInput = br.readLine().split(" ");

        int r = Integer.parseInt(rangeStrInput[0]);
        int c = Integer.parseInt(rangeStrInput[1]);

        String map[][] = new String[r][c];

        for(int i=0;i<r;i++){
            String strInputArr[] = br.readLine().split(" ");
            for(int j=0;j<c;j++){
                map[i][j] = strInputArr[j];
            }
        }
        String startCol = map[0][0];
        int answer =0;
        
        for(int i=1;i<r-2;i++){
            for(int j=1;j<c-2;j++){
                if(!map[i][j].equals(startCol)){
                    for(int k = i+1;k<r-1;k++){
                        for(int w = j+1;w<c-1;w++){
                            if(map[k][w].equals(startCol)){
                                answer++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}