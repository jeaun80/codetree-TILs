import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]inputStrSizeArr = br.readLine().split(" ");

        int n = Integer.parseInt(inputStrSizeArr[0]);
        int k = Integer.parseInt(inputStrSizeArr[1]);

        int bombList[] = new int[n];

        for(int i=0;i<n;i++){

            bombList[i] = Integer.parseInt(br.readLine());
        }
        int answer = -1;

        for(int i = 0;i<n-1;i++){//폭탄선택
            int bombNum = bombList[i];
            
            for(int j = i+1;j<n;j++){
                if(bombNum == bombList[j]){
                    if(k>=(j-i)){
                        answer = Math.max(bombNum,answer);
                    }
                    else{
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}