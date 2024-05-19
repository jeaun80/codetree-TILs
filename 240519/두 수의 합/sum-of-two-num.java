import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Long,Integer> map = new HashMap<>();
        String[]StrArr = br.readLine().split(" ");

        int n = Integer.parseInt(StrArr[0]);
        Long k = Long.parseLong(StrArr[1]);

        String[]arr = br.readLine().split(" ");
        Long[]intArr = new Long[n];
        for(int i =0;i <n;i++){
            intArr[i] = Long.parseLong(arr[i]);
        }

        for(int i=0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                Long sum = intArr[i]+intArr[j];
                // Long sum = Long.valueOf(intArr[i])+Long.valueOf(intArr[j]);
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }

        System.out.println(map.getOrDefault(k,0));





        // 여기에 코드를 작성해주세요.
    }
}