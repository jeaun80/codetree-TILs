import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[]inputStrArr = br.readLine().split("");

        int answer =0;

        for(int i=0;i<inputStrArr.length-2;i++){
            if(inputStrArr[i].equals("C")){
                for(int j=i+1;j<inputStrArr.length-1;j++){
                    if(inputStrArr[j].equals("O")){
                        for(int k = j+i;k<inputStrArr.length;k++){
                            if(inputStrArr[k].equals("W")){
                                answer++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}