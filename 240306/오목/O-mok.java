import java.util.*;
import java.io.*;

public class Main {

    static int GARO = 0;

    static int [][]map = new int[19][19];
    static int resulti=0;
    static int resultj = 0;
    static int resultLeft =0;
    static int resultRight =0;
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for(int i=0;i<19;i++){
            String[] inputStrArr = br.readLine().split(" ");
            for(int j=0;j<inputStrArr.length;j++){
                map[i][j] = Integer.parseInt(inputStrArr[j]);
            }
        }
        int answer =0;
        for(int i=0;i<19;i++){

            for(int j=0;j<18;j++){

                if(map[i][j]==0){
                    continue;
                }
                answer = con(map[i][j],i,j);
                if(answer>0){
                    midcon(answer,map[i][j],i,j);
                    System.out.println(map[i][j]);
                    System.out.println(resulti+" "+resultj);
                    return;
                }
            }
        }


        // 여기에 코드를 작성해주세요.
    }

    public static int midcon(int answer, int n,int i,int j){

        if(answer==1){
            i+=(resultRight-resultLeft)/2;

            j++;
            i++;
        }
        else if(answer==2){
            j+=(resultRight-resultLeft)/2;
            j++;
            i++;
        }
        else if(answer==3){
            i+=(resultRight-resultLeft)/2;
            j+=(resultRight-resultLeft)/2;
            j++;
            i++;
        }
        else if(answer==4){

            i-=(resultRight-resultLeft)/2;
            j+=(resultRight-resultLeft)/2;
            j++;
            i++;

        }

        resulti = i;
        resultj =j;
        return 0;


    }
    public static int con(int n,int i,int j){
            //가로 0 세로 1 좌대각 2 우대각 3
        //가로[i][i+1-1]
        int movePi =i;
        int moveMi =i;
        int movePj =j;
        int moveMj =j;
        int right =0;
        int left =0;
        int len = 1;
        boolean pFlag = false;
        boolean mFlag = false;
        int result =0;
        int move = 0;
        //
        for(int r = 0;r<5;r++){
            if(movePi<18){
                movePi++;
                if(map[movePi][j]==n){
                    len++;
                    right++;
                }
                else{
                    break;
                }
            }
        }
        for(int r = 0;r<5;r++){
            if(moveMi>0){
                moveMi--;
                if(map[moveMi][j]==n){
                    len++;
                    left++;
                }
                else{
                    break;
                }
            }
        }
        if(len==5){
            move = 1;
            resultRight = right;
            resultLeft = left;
            return move;
        }
        pFlag = false;
        mFlag = false;
        moveMi = i;
        movePi = i;
        len =1;

        right=0;
        left=0;
        for(int r=0;r<5;r++){
            if(movePj<18){
                movePj++;
                if(map[i][movePj]==n){
                    len++;
                    right++;

                }
                else{
                    break;
                }
            }
        }

        for(int r=0;r<5;r++){
            if(moveMj>0){
                moveMj--;
                if(map[i][moveMj]==n){
                    left++;
                    len++;
                }
                else{
                    break;
                }
            }
        }

            if(len==5){
                move = 2;

                resultRight = right;
                resultLeft = left;
                return move;
            }

        pFlag = false;
        mFlag = false;

        right=0;
        left=0;
        moveMj = j;
        movePj = j;
        len =1;

        for(int r=0;r<5;r++){
            if(movePi<18 && movePj <18){
                movePj++;
                movePi++;
                if(map[movePi][movePj]==n){
                    len++;
                    right++;

                }
                else{
                    break;
                }
            }
        }
        for(int r=0;r<5;r++){
            if(moveMj>0 && moveMi>0){
                moveMj--;
                moveMi--;
                if(map[moveMi][moveMj]==n){
                    left++;
                    len++;
                }
                else{
                    break;
                }
            }
        }

            if(len==5){
                move = 3;

                resultRight = right;
                resultLeft = left;
                return move;
            }

        right=0;
        left=0;
        //우하향 대각선
        for(int r=0;r<5;r++){
            if(pFlag && mFlag){
                break;
            }

            if(movePi<18 && movePj <18){
                movePj++;
                movePi++;
                if(map[movePi][movePj]==n){
                    len++;
                    right++;

                }
                else{
                    break;
                }
            }
            if(moveMj>0 && moveMi>0){
                moveMj--;
                moveMi--;
                if(map[moveMi][moveMj]==n){
                    left++;
                    len++;
                }
                else{
                    break;
                }
            }
        }
        pFlag = false;
        mFlag = false;
        moveMi = i;
        movePi = i;
        moveMj = j;
        movePj = j;
        len =1;

        right=0;
        left=0;
        for(int r=0;r<5;r++){
            
            if(moveMi>0 && movePj<18){
                
                movePj++;
                moveMi--;
                if(map[moveMi][movePj]==n){

                    len++;
                    right++;

                }
                else{
                    break;
                }
            }
        }

        for(int r=0;r<5;r++){
            if(moveMj>0 && movePi<18){
                moveMj--;
                movePi++;
                if(map[movePi][moveMj]==n){

                    left++;
                    len++;
                }
                else{
                    break;
                }
            }
        }
            if(len==5){
                move = 4;

                resultRight = right;
                resultLeft = left;
                return move;
            }
        //우하향 대각선
        return 0;
    }

}