import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

    public static class bosuk implements Comparable<bosuk>{

        int num;
        double weight;
        double price;

        public bosuk(int num ,double weight, double price){

            this.num = num;
            this.weight = weight;
            this.price = price;
        }

        @Override
        public int compareTo(bosuk o){

            if(o.price > this.price){
                return 1;
            }
            else{
                return -1;
            }
        }

    }
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        String[]sizeStrArr = br.readLine().split(" ");

        int n = Integer.parseInt(sizeStrArr[0]);
        double m = Double.parseDouble(sizeStrArr[1]);
        List<bosuk>bosukList = new ArrayList<>();



        for(int i=0;i<n;i++){


            String[] inputStrArr = br.readLine().split(" ");
            double price = Double.parseDouble(inputStrArr[1])/Double.parseDouble(inputStrArr[0]);


            bosukList.add(new bosuk(Integer.parseInt(inputStrArr[0]),Double.parseDouble(inputStrArr[1]),price));
        }
        Collections.sort(bosukList);
        double sum =0;
        double weightSum = 0;
        for(int i=0;i<n;i++){
            //System.out.println(bosukList.get(i).price);

            for(int j=0;j<bosukList.get(i).num;j++){
                if(weightSum<= m-1){
                    sum+=bosukList.get(i).price;
                    weightSum+=1;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(String.format("%.3f", sum)); //결과 : 3.142

        //System.out.println(Math.round(sum*1000)/1000.0); //결과 : 3.142
        // 여기에 코드를 작성해주세요.
    }
}