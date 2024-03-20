import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        String StrArr = br.readLine();
        int answer = 0;
        for(int i=0;i<StrArr.length();i++){
            //i = 시작지점
            for(int j=0;j<StrArr.length()-i;j++){
                //j = 문자열길이


                String frontStr= StrArr.substring(i,i+j+1);
                String backStr = StrArr.substring(i+1+j,StrArr.length());

                if(backStr.contains(frontStr)){
                    break;
                }
                else{
                    answer = Math.max(answer, frontStr.length());
                }
                //System.out.println(frontStr+" "+backStr);
            }
        }
        System.out.println(answer);



        // 여기에 코드를 작성해주세요.
    }
}