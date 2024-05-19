import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputStrArr[] = br.readLine().split(" ");

        int n =Integer.parseInt(inputStrArr[0]);
        int m =Integer.parseInt(inputStrArr[1]);
        String Arr[] = br.readLine().split(" ");

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int num = Integer.parseInt(Arr[i]);
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        String mArr[] = br.readLine().split(" ");

        for(int i=0;i<m;i++){
            int mNum = Integer.parseInt(mArr[i]);
            System.out.print(map.getOrDefault(mNum,0)+" ");
        }


        // 여기에 코드를 작성해주세요.
    }
}