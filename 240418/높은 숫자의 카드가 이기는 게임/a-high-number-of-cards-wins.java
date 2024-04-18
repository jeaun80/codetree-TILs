import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer>bList = new ArrayList<>();

        for(int i=0;i<n;i++){
            bList.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(bList,Comparator.reverseOrder());

        int cnt = 0;
        int stackCnt = 0;
        int bCursur = 0;
        int bValue = bList.get(bCursur);
        for(int i=2*n;i>0;i--){
            if(bValue<i){
                stackCnt++;
            }
            else if(bValue==i){
                if(stackCnt>0){
                    stackCnt--;
                    cnt++;
                }
                    if(bCursur<bList.size()-1){
                        bCursur++;
                        bValue = bList.get(bCursur);
                    }
            }
        }
        System.out.println(cnt);

        // 여기에 코드를 작성해주세요.
    }
}