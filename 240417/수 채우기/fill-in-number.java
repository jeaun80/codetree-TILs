import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if(n==1 || n==3){
            System.out.println(-1);
            return;
        }
        else if(n==2){

            System.out.println(1);
            return;
        }
        else if(n==4){

            System.out.println(2);
            return;
        }

        int money = 0;
        int count = 0;

        int namoji = n%5;
        count+= n/5;

        if(namoji==1){
            if(n>10){
                count+=2;
            }
            else{
                count =3;
            }
        }
        else if(namoji==2){
            count+=1;
        }
        else if(namoji==3){
            if(n==8){
                count =4;
            }
            else{
                count+=3;
            }
        }
        else if(namoji==4){
            count+=2;
        }


        System.out.println(count);
        // 여기에 코드를 작성해주세요.
    }
}