import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException  {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[]inputStrArr = new String[n];

        for(int i=0;i<n;i++){
            inputStrArr[i] = br.readLine();
        }
        Arrays.sort(inputStrArr, new Comparator<String>(){
            @Override
            public int compare(String o,String o2){

                int sum1 = Integer.parseInt(o+o2);
                int sum2 = Integer.parseInt(o2+o);
                if(sum1>sum2){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });

        for(int i=0;i<n;i++){
            System.out.print(inputStrArr[i]);
        }
        // 여기에 코드를 작성해주세요.


    }
}