import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int map[] = new int[n];

        for(int i=0;i<n;i++){
            map[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        for(int k = 1;k<=1000;k++){

            int count =0;
            boolean flag = false;
            for(int i = 0;i<n;i++){
                if(k<map[i] && !flag){
                    count++;
                    flag = true;
                }
                if(k>=map[i] && flag){
                    flag = false;

                }
            }

            answer = Math.max(count,answer);
        }

        System.out.println(answer);

        // 여기에 코드를 작성해주세요.
    }
}