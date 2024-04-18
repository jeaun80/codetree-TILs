import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<bomb>bombList = new ArrayList<>();
        int socoreSum = 0;
        Map<Integer,Integer>scoreMap = new HashMap<>();

        for(int i =0;i<n;i++){
            String[] inputStrArr = br.readLine().split(" ");
            bombList.add(new bomb(Integer.parseInt(inputStrArr[0]),Integer.parseInt(inputStrArr[1])));
        }

        Collections.sort(bombList);

        for(int i=0;i<n;i++){
            int endTime = bombList.get(i).endTime;
            int score = bombList.get(i).score;

            if(scoreMap.containsKey(endTime)){
                if(scoreMap.get(endTime)<score){
                    scoreMap.put(endTime,score);
                }
            }
            else{
                scoreMap.put(endTime,score);
            }
        }
        
        for(int score : scoreMap.values()){
            // System.out.println(score);
            socoreSum+=score;
        }
        System.out.println(socoreSum);

        // 여기에 코드를 작성해주세요.
    }


    public static class bomb implements Comparable<bomb>{

        public int score;
        public int endTime;

        public bomb(int score,int endTime){
            this.score = score;
            this.endTime = endTime;
        }
        @Override
        public int compareTo(bomb b){
            if(b.score==this.score){
                return b.endTime-this.endTime;
            }
            else{
                return this.score-b.score;
            }
        }


    }
}