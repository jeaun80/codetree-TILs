import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        int map[][]= new int[n][2];

        for(int i=0;i<n;i++){

            String[]inputStrArr = br.readLine().split(" ");
            map[i][0] = Integer.parseInt(inputStrArr[0]);
            map[i][1] = Integer.parseInt(inputStrArr[1]);
        }

        int answer =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    int ax = map[i][0];
                    int ay = map[i][1];
                    int bx = map[j][0];
                    int by = map[j][1];
                    int cx = map[k][0];
                    int cy = map[k][1];


                    int sum = 0;
                    if(ax==bx){
                        if(ay==cy){
                            sum = Math.abs(ay-by)*Math.abs(cx-ax)*2;

                        }
                        else if(by==cy){
                            sum = Math.abs(ay-by)*Math.abs(cx-bx)*2;

                        }
                    }
                    else if(ax==cx && (ay==by || cy == by)){
                        if(ay==by){
                            sum = Math.abs(ay-cy)*Math.abs(bx-ax);
                        }
                        else if(by==cy){
                            sum = Math.abs(ay-cy)*Math.abs(cx-bx);

                        }

                    }
                    else if(bx==cx && (by==ay || cy ==ay)){
                        if(ay==cy){
                            sum = Math.abs(cy-by)*Math.abs(cx-ax);

                        }
                        else if(by==ay){
                            sum = Math.abs(cy-by)*Math.abs(ax-bx);
                        }
                    }
                    if(sum>0){
                        //System.out.println(ax+" "+ay+" "+bx + " "+by+" "+cx+" "+cy);
                    }

                    answer = Math.max(sum,answer);
                }
            }
        }
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}