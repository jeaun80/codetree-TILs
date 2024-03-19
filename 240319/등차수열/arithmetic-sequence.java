import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        String[]inputStrArr = br.readLine().split(" ");
        int map[] = new int[inputStrArr.length];
        for(int i=0;i<inputStrArr.length;i++){
            map[i] = Integer.parseInt(inputStrArr[i]);
        }

        int answer = 0;
        for(int k = 2;k<100;k++){
            int count =0;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(Math.abs(k-map[i])==Math.abs(k-map[j])){
                        count++;
                    }

                }
            }
            answer = Math.max(count,answer);
        }

        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}