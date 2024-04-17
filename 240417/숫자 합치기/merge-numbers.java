import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nSize = Integer.parseInt(br.readLine());
        String[] inputStrArr = new String[nSize];
        Queue<Integer>que = new PriorityQueue<>();
        int sum = 0;

        inputStrArr = br.readLine().split(" ");
        for(int i=0;i<nSize;i++){
            que.add(Integer.parseInt(inputStrArr[i]));
        }

        for(int i=0;i<nSize-1;i++){
            int firstN = que.poll();
            int secondN = que.poll();
            int isum = firstN + secondN;
            sum+= isum;
            que.add(isum);
        }
        System.out.println(sum);
    }
}