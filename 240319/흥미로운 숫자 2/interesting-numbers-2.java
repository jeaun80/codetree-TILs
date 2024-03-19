import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[]inputStrArr = br.readLine().split(" ");


        int x = Integer.parseInt(inputStrArr[0]);
        int y = Integer.parseInt(inputStrArr[1]);

        int answer =0;
        for(int i=x;i<=y;i++){

            int map[] = new int[10];

            String strNumArr[] = String.valueOf(i).split("");

            for(String s:strNumArr){
                int j = Integer.parseInt(s);
                map[j]++;
            }
            for(int j=0;j<10;j++){
                if(map[j]==(strNumArr.length-1)){
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);

        // 여기에 코드를 작성해주세요.
    }
}