import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int map[][] = new int[3][3];
        for(int i =0;i<3;i++){


            String[]inputStrArr = br.readLine().split("");

            for(int j=0;j<3;j++){
                map[i][j] = Integer.parseInt(inputStrArr[j]); 
            }
        }
        int answer =0;

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<3;i++){
            set.add(map[i][0]);
            set.add(map[i][1]);
            set.add(map[i][2]);
            if(set.size()==2){
                answer++;
            }
            set.clear();
        }
        for(int i=0;i<3;i++){
            set.add(map[0][i]);
            set.add(map[1][i]);
            set.add(map[2][i]);
            if(set.size()==2){
                answer++;
            }
            set.clear();
        }

        set.add(map[0][0]);
        set.add(map[1][1]);
        set.add(map[2][2]);
        if(set.size()==2){
            answer++;
        }
        set.clear();
        set.add(map[2][0]);
        set.add(map[1][1]);
        set.add(map[0][2]);
        if(set.size()==2){
            answer++;
        }

        System.out.println(answer);
    }
}