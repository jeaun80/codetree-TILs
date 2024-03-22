import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]inputSizeStrArr = br.readLine().split(" ");

        int n = Integer.parseInt(inputSizeStrArr[0]);
        int k = Integer.parseInt(inputSizeStrArr[1]);

        int map[] = new int[n];
        

        for(int i=0;i<n;i++){
            map[i] = Integer.parseInt(br.readLine());
            
        }

        int sum = 0;
        int icount = n-1;
        int answer =0;

        while(sum!=k){
            if(sum+map[icount]<=k){
                sum+=map[icount];
                answer++;
            }
            else{
                icount--;
            }
            if(icount<0){
                break;
            }
        }
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}