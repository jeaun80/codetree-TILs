import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<meetting> meetList = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] inputStrArr = br.readLine().split(" ");
            meetList.add(new meetting(Integer.parseInt(inputStrArr[0]),Integer.parseInt(inputStrArr[1])));
        }

        Collections.sort(meetList);

        int endCursur = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(meetList.get(i).start>=endCursur){
                sum++;
                endCursur = meetList.get(i).end;
            }
        }
        System.out.println(sum);
        // 여기에 코드를 작성해주세요.
    }


    public static class meetting  implements Comparable<meetting>{


        public int start;
        public int end;

        public meetting(int start , int end){
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(meetting m){
            if(m.end==this.end){
                return this.start-m.start;
            }else{
                return this.end-m.end;
            }
        }
    }
}