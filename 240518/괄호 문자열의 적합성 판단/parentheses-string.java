import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]inputArr = br.readLine().split("");


        Stack<String> stack = new Stack<>();
        boolean flag = true;
        for(int i=0;i<inputArr.length;i++){
            if(inputArr[i].equals("(")){
                stack.push("(");
            }
            else{
                if(stack.empty()){
                    flag = false;
                    break;
                }
                stack.pop();
            }
        }

        String result = "Yes";
        if(!flag || !stack.empty()){
            result = "No";
        }
        System.out.println(result);
        // 여기에 코드를 작성해주세요.
    }
}