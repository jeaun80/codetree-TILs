import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] inputStrArr = br.readLine().split("");
        boolean flag = false;
        for(int i=0;i<inputStrArr.length;i++){
            if(inputStrArr[i].equals("0")){
                inputStrArr[i]= "1";
                flag = true;
                break;
            }

        }
        if(!flag){
            inputStrArr[inputStrArr.length-1] = "0";
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<inputStrArr.length;i++){
            sb.append(inputStrArr[i]);
        }
        int answer = Integer.parseInt(sb.toString(),2);

        System.out.println(answer);


        // 여기에 코드를 작성해주세요.
    }
}