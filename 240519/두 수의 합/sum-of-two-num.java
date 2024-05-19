import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer,Integer> map = new HashMap<>();
        String[]StrArr = br.readLine().split(" ");

        int n = Integer.parseInt(StrArr[0]);
        int k = Integer.parseInt(StrArr[1]);

        String[]arr = br.readLine().split(" ");
        int[]intArr = new int[n];
        for(int i =0;i <n;i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }

        for(int i=0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                int sum = intArr[i]+intArr[j];
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }

        System.out.println(map.getOrDefault(k,0));





        // 여기에 코드를 작성해주세요.
    }
}