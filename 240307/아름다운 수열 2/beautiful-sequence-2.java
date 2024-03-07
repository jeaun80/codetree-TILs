import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] sizeInputStrArr = br.readLine().split(" ");

        int aSize = Integer.parseInt(sizeInputStrArr[0]);
        int bSize = Integer.parseInt(sizeInputStrArr[1]);

        if(aSize<bSize){
            System.out.println(0);
            return;
        }
        String[] InputAStrArr = br.readLine().split(" ");
        int[]Amap = new int[aSize];
        for(int i=0;i<aSize;i++){
            Amap[i] = Integer.parseInt(InputAStrArr[i]);
        }


        String[] InputBStrArr = br.readLine().split(" ");
        int[]Bmap = new int[bSize];
        for(int i=0;i<bSize;i++){
            Bmap[i] = Integer.parseInt(InputBStrArr[i]);
        }

        int []map = new int[101];
        for(int i=0;i<bSize;i++){
            map[Bmap[i]]++;
        }
        int answer = 0;
        for(int i=0;i<aSize-bSize+1;i++){
            int[] comapreMap = new int[101];
            for(int j=i;j<bSize+i;j++){
                comapreMap[Amap[j]]++;
            }
            boolean flag = true;
            for(int j=0;j<map.length;j++){
                if(map[j]!=comapreMap[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer++;
            }

        }
        System.out.println(answer);



        // 여기에 코드를 작성해주세요.
    }
}