import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer>bList = new ArrayList<>();
        List<Integer>aList = new LinkedList<>();

        for(int i=0;i<n;i++){
            bList.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(bList);

        int cnt = 0;
        int stackCnt = 0;
        for(int i=2*n;i>0;i--){

            if(!bList.contains(i)){
                stackCnt++;
            }
            else{
                if(stackCnt>0){
                    stackCnt--;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

        // 여기에 코드를 작성해주세요.
    }
}