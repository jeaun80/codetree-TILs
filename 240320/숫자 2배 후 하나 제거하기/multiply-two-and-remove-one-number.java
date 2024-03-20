import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        String[]inputStrArr = br.readLine().split(" ");
        int map[] = new int[n];
        for(int i=0;i<n;i++){

            map[i] = Integer.parseInt(inputStrArr[i]);
        }
        int answer = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for( int j = 0;j<n-1;j++){

                int sum = 0;
                List<Integer> copymap = new ArrayList<>();
                for(int k=0;k<n;k++){
                    if(k==i){
                        continue;
                    }
                    copymap.add(map[k]);
                }
                copymap.set(j,copymap.get(j)*2);
                for(int k=0;k<n-2;k++){
                    sum+=Math.abs(copymap.get(k)-copymap.get(k+1));
                }
                answer  = Math.min(sum,answer);
            }
        }
        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}