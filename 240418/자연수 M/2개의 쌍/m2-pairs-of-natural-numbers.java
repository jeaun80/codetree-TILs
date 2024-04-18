import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer>list = new ArrayList<>();

        for(int i=0;i<n;i++){

            String[] inputStrArr = br.readLine().split(" ");

            int su = Integer.parseInt(inputStrArr[0]);
            int num = Integer.parseInt(inputStrArr[1]);
            for(int j=0;j<su;j++){
                list.add(num);
            }
        }

        Collections.sort(list);
        int min = Integer.MIN_VALUE;
        int listSize = list.size();

        for(int i=0;i<list.size()/2;i++){
            int compareMin = list.get(i)+list.get(listSize-i-1);
            min = Math.max(compareMin,min);
        }
        System.out.println(min);
        // 여기에 코드를 작성해주세요.
    }
}