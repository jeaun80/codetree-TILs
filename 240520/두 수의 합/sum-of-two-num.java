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
        int ans= 0;

        for(int i=0;i<n;i++){

            long diff = k - intArr[i];
            if(map.containsKey(diff)){
                ans += map.get(diff);
            }

            if(!map.containsKey(intArr[i])){
                map.put(intArr[i],1);
            }
            else{
                map.put(intArr[i],map.get(intArr[i])+1);
            }
        }
        System.out.print(ans);
        // 여기에 코드를 작성해주세요.
    }
}