import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String inputStr = br.readLine();
            String[]arr;
            if(inputStr.contains("push")){
                arr = inputStr.split(" ");
                que.add(Integer.parseInt(arr[1]));

            }
            else if(inputStr.equals("front")){
                System.out.println(que.peek());
            }

            else if(inputStr.equals("size")){
                System.out.println(que.size());
            }
            else if(inputStr.equals("empty")){
                if(que.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
            else if(inputStr.equals("pop")){
                System.out.println(que.poll());
            }
        }

        // 여기에 코드를 작성해주세요.
    }
}