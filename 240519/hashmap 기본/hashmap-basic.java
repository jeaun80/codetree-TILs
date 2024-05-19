import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){

            String[]inputStrArr = br.readLine().split(" ");

            String arg = inputStrArr[0];
            int num = Integer.parseInt(inputStrArr[1]);

            if(arg.equals("add")){
                int value = Integer.parseInt(inputStrArr[2]);
                map.put(num,value);
            }

            if(arg.equals("remove")){
                map.remove(num);
            }
            if(arg.equals("find")){
                if(map.containsKey(num)){
                    System.out.println(map.get(num));
                }
                else{
                    System.out.println("None");
                }
            }
        }

        // 여기에 코드를 작성해주세요.
    }
}