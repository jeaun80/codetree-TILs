import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        String[] map = new String[101];

        int max  = -1;
        int min = 102;
        for(int i=0;i<n;i++){

            String[]inputStrArr= br.readLine().split(" ");
            int index = Integer.parseInt(inputStrArr[0]);
            map[index] = inputStrArr[1];
            max = Math.max(index,max);
            min = Math.min(index,min);
        }

        int answer = 0;

        for(int i=min;i<=max;i++){
            if(map[i]==null){
                continue;
            }
            int Hcount = 0;
            int Gcount = 0;
            for(int j=i;j<=max;j++){
                boolean flag = false;
                if(map[j]==null){
                    continue;
                }
                if(map[j].equals("G")){
                    Gcount++;
                    flag =true;
                }
                if(map[j].equals("H")){
                    Hcount++;
                    flag = true;
                }
                if(flag){

                    if(Gcount==0 || Hcount==0 || Hcount==Gcount){
                        answer = Math.max(j-i,answer);
                    }
                }
            }


        }
        System.out.println(answer);


        // 여기에 코드를 작성해주세요.
    }
}