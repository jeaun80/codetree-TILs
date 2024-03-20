import java.io.*;

public class Main {
    public static void main(String[] args)  throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        int map[][] = new int[n][3];

        for(int i =0;i<n;i++){
            String[]inputStrArr = br.readLine().split(" ");

            map[i][0] = Integer.parseInt(inputStrArr[0]);
            map[i][1] = Integer.parseInt(inputStrArr[1]);
            map[i][2] = Integer.parseInt(inputStrArr[2]);

        }
        int answer =0;
        for(int i=1;i<=3;i++){
            int midanswer = 0;
            int dolIndex = i;//위치를 나타냄
            for(int j = 0;j<n;j++){

                if(map[j][0] == dolIndex){
                    dolIndex = map[j][1];
                }
                else if(map[j][1]== dolIndex){
                    dolIndex = map[j][0];
                }

                if(map[j][2]==dolIndex){
                    midanswer++;
                }
            }
            answer = Math.max(midanswer,answer);
        }

        System.out.println(answer);


        // 여기에 코드를 작성해주세요.
    }
}