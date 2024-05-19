import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){

            String str = br.readLine();
            map.put(str,map.getOrDefault(str,0)+1);
        }
        int minNum = 0;
        for(int i: map.values()){
            minNum = Math.max(minNum,i);
        }

        System.out.println(minNum);


        // 여기에 코드를 작성해주세요.
    }
}