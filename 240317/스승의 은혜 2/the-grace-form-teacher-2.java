import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String[]inputStrArr = br.readLine().split(" ");

        int n = Integer.parseInt(inputStrArr[0]);
        int b = Integer.parseInt(inputStrArr[1]);

        int giftList[] = new int[n];
        for(int i=0;i<n;i++){
            giftList[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(giftList);
        int answer =0;
        for(int i=0;i<n;i++){
            int p = b;
            for(int j=0;j<n;j++){
                int gift = giftList[j];
                if(i==j){
                    gift/=2;
                }
                if(p<gift){
                    answer = Math.max(answer,j);
                }
                else{
                    p-=gift;

                    if(p==0){
                        answer = Math.max(answer,j+1);
                    }
                }
            }
        }
        System.out.println(answer);


        // 여기에 코드를 작성해주세요.
    }
}