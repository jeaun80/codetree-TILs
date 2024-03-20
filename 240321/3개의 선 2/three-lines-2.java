import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int map[][] = new int[n][2];
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){

            String[]inputStrArr = br.readLine().split(" ");
            map[i][0] = Integer.parseInt(inputStrArr[0]);
            map[i][1] = Integer.parseInt(inputStrArr[1]);
            set.add(map[i][0]);
            set.add(map[i][1]);
        }
        int answer = 1;
        for(int i :set){
            for(int j : set){ 
                for(int k : set){
                    boolean flag = false;
                    for(int s = 0;s<n;s++){
                        if(map[s][0]!=i && map[s][0]!=j && map[s][0]!=k && map[s][1]!=i && map[s][1]!=j && map[s][1]!=k ){
                            flag = true;
                        }
                        if(flag){
                            break;
                        }
                    }
                    if(!flag){
                        System.out.println(answer);
                        return;
                    }
                }
            }
        }
        System.out.println(0);




    
        // 여기에 코드를 작성해주세요.
    }
}