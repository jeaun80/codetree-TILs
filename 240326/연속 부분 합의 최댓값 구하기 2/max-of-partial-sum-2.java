import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int arr[] =new int[n];

        String[]inputStrArr = br.readLine().split(" ");

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(inputStrArr[i]);
        }
        int answer = Integer.MIN_VALUE;

        int cursur =0;
        int sum =0;
        for(int i=0;i<n;i++){

            sum+=arr[i];
            answer = Math.max(sum,answer);
            if(sum<0){
                sum = 0;
            }

        }

        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}