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

                Long sum1 = Long.parseLong(o+o2);
                Long sum2 = Long.parseLong(o2+o);
                if(sum1>sum2){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(inputStrArr[i]);
        }
            System.out.print(sb);

        // 여기에 코드를 작성해주세요.


    }
}