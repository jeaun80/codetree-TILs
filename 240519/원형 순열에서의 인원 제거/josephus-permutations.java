import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]strarr = br.readLine().split(" ");
        int n = Integer.parseInt(strarr[0]);
        int k = Integer.parseInt(strarr[1]);

        Queue<Integer> que = new LinkedList<>();

        for(int i =1;i<=n;i++){
            que.add(i);
        }
        List<Integer> list = new LinkedList<>();

        while(que.size()!=1){
            for(int i=0;i<k-1;i++){
                que.add(que.poll());
            }
            list.add(que.poll());
        }
        list.add(que.poll());

        for(int i : list){
            System.out.print(i+" ");
        }

        // 여기에 코드를 작성해주세요.
    }
}