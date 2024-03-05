import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        String[]inputStrArr = br.readLine().split("");
        int answer=0;
        if(inputStrArr.length<4){
            System.out.println(answer);
            return;
        }
        for(int i=0;i<inputStrArr.length-3;i++){
            if(inputStrArr[i].equals("(")){
                if(inputStrArr[i+1].equals("(")){
                    for(int j=i+2;j<inputStrArr.length-1;j++){
                        if(inputStrArr[j].equals(")") && inputStrArr[j+1].equals(")")){
                            answer++;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}