import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]strInputArr = br.readLine().split(" ");

        int n = Integer.parseInt(strInputArr[0]);
        int m = Integer.parseInt(strInputArr[1]);
        Map<String,Integer> map = new HashMap<>();
        Map<Integer,String> intmap = new HashMap<>();

        for(int i=1;i<=n;i++){
            String str = br.readLine();
            map.put(str,i);
            intmap.put(i,str);
        }
        for(int i=0;i<m;i++){
            String str = br.readLine();
            if(map.containsKey(str)){
                System.out.println(map.get(str));
            }else{
                System.out.println(intmap.get(Integer.parseInt(str)));
            }
        }

        // 여기에 코드를 작성해주세요.
    }
}