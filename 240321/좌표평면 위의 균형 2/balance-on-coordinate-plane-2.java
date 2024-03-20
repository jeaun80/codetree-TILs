import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        int map[][]= new int[101][101];
        for(int i=0;i<n;i++){

            String[]strArr = br.readLine().split(" ");

            map[Integer.parseInt(strArr[0])][Integer.parseInt(strArr[1])]= 1;
        }

        int answer =Integer.MAX_VALUE;
        
        for(int i=0;i<101;i+=2){// 가로선
            for(int j = 0;j<101;j+=2){//세로선

                int onesize = 0;
                int twosize = 0;
                int thrsize = 0;
                int fousize = 0;
                //갯수판별
                for(int s = 0;s<i;s++){
                    for(int w = 0;w<j;w++){
                        if(map[s][w]==1){

                            onesize++;
                        }
                    }
                }
            
                for(int s = i;s<101;s++){
                    for(int w = 0;w<j;w++){

                        if(map[s][w]==1){

                            twosize++;
                        }
                    }
                }

                for(int s = i;s<101;s++){
                    for(int w = j;w<101;w++){

                        if(map[s][w]==1){

                            thrsize++;
                        }
                    }
                }

                for(int s = 0;s<i;s++){
                    for(int w = j;w<101;w++){
                        if(map[s][w]==1){
                            fousize++;
                        }
                    }
                }

                int size = Math.max(onesize,twosize);
                size = Math.max(size,thrsize);
                size = Math.max(size,fousize);
                answer = Math.min(answer,size);
            }
        }

        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}