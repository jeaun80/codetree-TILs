import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        String[]inputStrArr = br.readLine().split(" ");

        int x = Integer.parseInt(inputStrArr[0]);
        int y = Integer.parseInt(inputStrArr[1]);


        int answer =y-x+1;
        for(int i=x;i<=y;i++){

            String s = String.valueOf(i);
            int slen = s.length();
            if(slen%2!=0){
                slen--;
            }
            for(int j = 0;j<slen/2;j++){
                int a =j;
                int b = s.length()-j-1;
                if(s.charAt(a)!=s.charAt(b)){
                    answer--;
                    break;
                }
            }

        }
        System.out.println(answer);
        
        // 여기에 코드를 작성해주세요.
    }
}