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

        for(int i=1;i<=2*n;i++){
            if(!bList.contains(i)){
                aList.add(i);
            }
        }
        Collections.sort(aList);
        int cnt = 0;
        int aCursur = 0;
        for(int bIndex=0;bIndex<n;bIndex++){
            int bValue = bList.get(bIndex);
            for(int aIndex=aCursur;aIndex<aList.size();aIndex++){
                if(bValue<aList.get(aIndex)){
                    // aList.remove(aIndex);
                    aCursur = aIndex;
                    cnt++;
                    break;
                }
                else{
                }
            }
        }
        System.out.println(cnt);

        // 여기에 코드를 작성해주세요.
    }
}