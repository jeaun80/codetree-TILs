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
        for(int i=1;i<=n;i++){//연속된 숫자를 몇개로 할지 
            for(int j=0;j<n-i+1;j++){//시작점
                int sum = 0;
                for(int k=j;k<i+j;k++){
                    sum+=arr[k];
                    if(sum<answer){
                        break;
                    }
                }
                answer = Math.max(sum,answer);
            }
        }

        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}