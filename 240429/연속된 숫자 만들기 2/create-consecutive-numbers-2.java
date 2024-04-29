import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]StrInputArr = br.readLine().split(" ");

        int a = Integer.parseInt(StrInputArr[0]);
        int b = Integer.parseInt(StrInputArr[1]);
        int c = Integer.parseInt(StrInputArr[2]);

        //1 a가 이동
        int MinDistance = Integer.MAX_VALUE;
        int aCase = Math.abs(b-c);
        if(aCase==1){
        }
        else if(aCase ==2){
            MinDistance = 1;
        }
        else if(aCase>=3){
            MinDistance = 2;
        }
        int cCase = Math.abs(a-b);

        if(cCase==1){
        }
        else if(cCase ==2){
            MinDistance = 1;
        }
        else if(cCase>=3){
            Math.min(MinDistance,2);
        }

        System.out.println(MinDistance);
    }
}