import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String []inputStrArr = br.readLine().split("");
        int answer =0;

        for(int i=0;i<inputStrArr.length;i++){
            if(inputStrArr[i].equals(")")){
                continue;
            }
            for(int j = i;j<inputStrArr.length;j++){
                if(inputStrArr[j].equals(")")){
                    answer++;
                }
            }

        }

        System.out.println(answer);


        // 여기에 코드를 작성해주세요.
    }
}