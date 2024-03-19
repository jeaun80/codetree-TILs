import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]inputStrSizeArr = br.readLine().split(" ");

        int T = Integer.parseInt(inputStrSizeArr[0]);
        int a = Integer.parseInt(inputStrSizeArr[1]);
        int b = Integer.parseInt(inputStrSizeArr[2]);

        int map[] = new int[1001];
        for(int i=0;i<T;i++){

            String[]inputStrArr = br.readLine().split(" ");

            if(inputStrArr[0].equals("S")){
                map[Integer.parseInt(inputStrArr[1])] = 1;
            }
            else if(inputStrArr[0].equals("N")){
                map[Integer.parseInt(inputStrArr[1])] = 2;
            }
            
        }
        int answer =0;
        for(int i=a;i<=b;i++){
            int plusS = 1001;
            int plusN = 1001;
            int minusS = 1001;
            int minusN = 1001;
            boolean N = false;
            boolean S = false;

            for(int j = i;j<map.length;j++){
                if(!S){
                    if(map[j]==1){
                        plusS = j-i;
                        S = true;
                    }
                }
                if(!N){
                    if(map[j]==2){
                        plusN = j-i;
                        N = true;
                    }
                }
                if(S && N){
                    break;
                }
            }
            N = false;
            S = false;
            for(int j = i;j>=0;j--){
                if(!S){
                    if(map[j]==1){
                        minusS = i-j;
                        S = true;
                    }
                }
                if(!N){
                    if(map[j]==2){
                        minusN = i-j;
                        N = true;
                    }
                }
                if(S && N){
                    break;
                }
            }

            int d1 = Math.min(plusS,minusS);
            int d2 = Math.min(minusN,plusN);
            if(d1<=d2){
                answer++;
            }


        }

        System.out.println(answer);

        // 여기에 코드를 작성해주세요.
    }
}