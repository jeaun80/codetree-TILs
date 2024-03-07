import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]nkStrArr = br.readLine().split(" ");

        int n = Integer.parseInt(nkStrArr[0]);
        int k = Integer.parseInt(nkStrArr[1]);

        String map[] = new String[10001];
        
        int min = 0;
        for(int i=0;i<n;i++){

            String[]inputArr = br.readLine().split(" ");
            int place  = Integer.parseInt(inputArr[0]);
            min = Math.max(place,min);
            map[place] = inputArr[1];
        }

        int answer =0;

        for(int i=1;i<10000-k+1;i++){
            int midanswer =0;
            for(int j=0;j<=k;j++){
                if(map[i+j]==null){
                    continue;
                }
                if(map[i+j].equals("G")){
                    midanswer+= 1;
                }
                else if(map[i+j].equals("H")){
                    midanswer+=2;
                }
            }

            answer = Math.max(midanswer,answer);
        }

        System.out.println(answer);
    }
}