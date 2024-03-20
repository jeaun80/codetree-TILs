import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[]inputStrArr = br.readLine().split(" ");

        int a = Integer.parseInt(inputStrArr[0]);
        int b = Integer.parseInt(inputStrArr[1]);
        int c = Integer.parseInt(inputStrArr[2]);

        int answer =0;
        for(int i=0;i<c;i++){

            if(a*i>c){
                break;
            }

            for(int j=0;j<c;j++){
                int sum = a*i+b*j;
                if(sum<=c){
                    answer = Math.max(sum,answer);
                }
                if(b*j>sum){
                    break;
                }
            }
        }

        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}