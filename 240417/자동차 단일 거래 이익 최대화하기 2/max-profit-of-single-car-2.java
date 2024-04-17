import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        String[] inputStrArr = br.readLine().split(" ");

        int[] carArr = new int[n];
        for(int i=0;i<n;i++){
            carArr[i] = Integer.parseInt(inputStrArr[i]);
        }

        int buyCursur = 0;
        int compareCursur = 1;
        int money = 0;

        for(int i=0;i<n-1;i++){
            if(carArr[buyCursur]<carArr[compareCursur]){
                int compareResult = carArr[compareCursur]-carArr[buyCursur];
                money = Math.max(compareResult,money);
            }
            else{
                buyCursur = compareCursur;
            }
            compareCursur++;
        }

        System.out.println(money);
        
        // 여기에 코드를 작성해주세요.
    }
}