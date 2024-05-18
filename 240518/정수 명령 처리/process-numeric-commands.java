import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){

            String arg = br.readLine();
            String arr[] = new String[2];
            if(arg.contains("push")){
                arr = arg.split(" ");
            }


            if(arg.equals("size")){
                System.out.println(stack.size());
            }

            if(arg.equals("empty")){
                int emptyResult=0;
                if(stack.empty()){
                    emptyResult = 1;
                }
                else{
                    emptyResult = 0;
                }
                System.out.println(emptyResult);
            }
            if(arg.equals("pop")){
                if(!stack.empty()){
                    System.out.println(stack.pop());

                }
            }
            if(arg.contains("push")){
                stack.push(Integer.parseInt(arr[1]));
            }

            if(arg.equals("top")){
                System.out.println(stack.peek());
            }
        }
        // 여기에 코드를 작성해주세요.
    }
}