import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]StrInputArr = br.readLine().split(" ");
        int a = Integer.parseInt(StrInputArr[0]);
        int b = Integer.parseInt(StrInputArr[1]);
        int x = Integer.parseInt(StrInputArr[2]);
        int y = Integer.parseInt(StrInputArr[3]);

        int MinDistance = Integer.MAX_VALUE;

        MinDistance = Math.min(MinDistance,Math.abs(a-b));

        //총 3가지 a - x - y - b, a- y - x - b, a - b
        int f = Math.abs(a-x)+Math.abs(b-y);
        int s = Math.abs(a-y)+Math.abs(b-x);

        MinDistance = Math.min(MinDistance,f);
        MinDistance = Math.min(MinDistance,s);
        System.out.println(MinDistance);
        // 여기에 코드를 작성해주세요.
    }
}