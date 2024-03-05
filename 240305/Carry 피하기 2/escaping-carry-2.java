import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        
        int numbersArr[] = new int[n];

        for(int i=0;i<n;i++){
            numbersArr[i] = Integer.parseInt(br.readLine());
        }
        int answer = -1;

        for(int i=0;i<n-2;i++){
            

            for(int j = i+1;j<n-1;j++){


                int midanswer = con(numbersArr[i],numbersArr[j]);
                if(midanswer==-1){
                    continue;
                }
                //System.out.println("mid = "+midanswer);
                for(int k=j+1;k<n;k++){
                    int rastanswer=con(midanswer,numbersArr[k]);
                    //System.out.println("mid = "+midanswer+" last = "+rastanswer);

                    if(rastanswer==-1){
                        continue;
                    }
                    answer = Math.max(rastanswer,answer);
                    
                }
            }
        }
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }

    public static int con(int iNum, int jNum){

        //carry발생시 return 0


        String iNumStr = String.valueOf(iNum);
        String jNumStr = String.valueOf(jNum);
        int len = Math.min(iNumStr.length(),jNumStr.length());
        int maxlen = Math.max(iNumStr.length(),jNumStr.length());

        boolean flag = true;
        if(iNum>jNum){
            flag = true;
        }
        else{
            flag =false;
        }
        StringBuilder sbi = new StringBuilder(iNumStr);
        sbi.reverse();
        String[] iNumStrArr = sbi.toString().split("");
        StringBuilder sbj = new StringBuilder(jNumStr);
        sbj.reverse();
        String[] jNumStrArr = sbj.toString().split("");

        int result =-1;
        for(int i=0;i<maxlen;i++){
            int n=0;
            if(i<len){
                n = Integer.parseInt(iNumStrArr[i])+Integer.parseInt(jNumStrArr[i]);
            }
            else{
                if(flag){
                    n = Integer.parseInt(iNumStrArr[i]);
                }
                else{
                    n = Integer.parseInt(jNumStrArr[i]);
 
                }
            }
            //System.out.println(n*Math.pow(10.0,i));
            if(n>=10){
                result = -1;
                break;
            }
            result += n*Math.pow(10.0,i);
        }
        return result;
        

        
        
    }
}