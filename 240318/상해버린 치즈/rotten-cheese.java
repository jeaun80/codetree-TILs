import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        String[] inputStrSizeArr = br.readLine().split(" ");

        int personNum = Integer.parseInt(inputStrSizeArr[0]);
        int cheezeNum = Integer.parseInt(inputStrSizeArr[1]);
        int eatRecordNum = Integer.parseInt(inputStrSizeArr[2]);
        int sickRecordNum = Integer.parseInt(inputStrSizeArr[3]);

        int eatRecordMap[][] = new int[eatRecordNum][3];
        int sickRecordMap[][] = new int[sickRecordNum][2];

        for(int i=0;i<eatRecordNum;i++){

            String[]inputEatStrArr = br.readLine().split(" ");
            eatRecordMap[i][0] = Integer.parseInt(inputEatStrArr[0]);
            eatRecordMap[i][1] = Integer.parseInt(inputEatStrArr[1]);
            eatRecordMap[i][2] = Integer.parseInt(inputEatStrArr[2]);
        }
        for(int i=0;i<sickRecordNum;i++){
            String[]inputSickStrArr = br.readLine().split(" ");

            sickRecordMap[i][0] = Integer.parseInt(inputSickStrArr[0]);
            sickRecordMap[i][1] = Integer.parseInt(inputSickStrArr[1]);

        }

        ///input finish

        Set<Integer> sickCheezeSet = new HashSet<>();
        Set<Integer> sickPersonSet = new HashSet<>();

        for(int sickRecord =0;sickRecord<sickRecordNum;sickRecord++){

            int sickperson = sickRecordMap[sickRecord][0];
            int sicktime = sickRecordMap[sickRecord][1];

            for(int i=0;i<eatRecordNum;i++){
                
                if(sickperson==eatRecordMap[i][0] && sicktime>eatRecordMap[i][2]){
                    int sickCheeze = eatRecordMap[i][1];
                    sickCheezeSet.add(sickCheeze);
                }
            }
        }


        for(int sickCheeze:sickCheezeSet){
            for(int i=0;i<eatRecordNum;i++){
                if(sickCheeze==eatRecordMap[i][1]){
                    sickPersonSet.add(eatRecordMap[i][0]);
                }
            }
        }

        System.out.println(sickPersonSet.size());


        // 여기에 코드를 작성해주세요.
    }
}