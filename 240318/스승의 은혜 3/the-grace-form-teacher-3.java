import java.util.*;
import java.io.*;

public class Main {
    static class wish{

        public int wishPrice;
        public int shipping;

        public wish(int wishPrice,int shipping){
            this.wishPrice = wishPrice;
            this.shipping = shipping;
        }
    }
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[]inputStrSizeArr = br.readLine().split(" ");

        int studentNum = Integer.parseInt(inputStrSizeArr[0]);
        int price = Integer.parseInt(inputStrSizeArr[1]);

        int wishMap[][] = new int [studentNum][2];

        List<wish>wishList = new ArrayList<>();
        
        for(int i=0;i<studentNum;i++){
            String[]inputStrArr = br.readLine().split(" ");
            wishList.add(new wish(Integer.parseInt(inputStrArr[0]),Integer.parseInt(inputStrArr[1])));
        }
        //input finish

        //sort
        Collections.sort(wishList,new Comparator<wish>(){
            @Override
            public int compare(wish o1,wish o2){
                return o1.wishPrice-o2.wishPrice;
            }
        });
        int answer =0;

        for(int coupon=0;coupon<studentNum;coupon++){
            int mPrcie=price;
            for(int st=0;st<studentNum;st++){//가격게산
                int midprice = wishList.get(st).wishPrice;
                int shipping = wishList.get(st).shipping;
                if(st==coupon){
                    midprice/=2;
                }
                int wishPrice = midprice+shipping;

                mPrcie-=wishPrice;
                if(mPrcie<0){
                    answer = Math.max(answer,st);
                }
            }
            
        }
        System.out.println(answer);

        // 여기에 코드를 작성해주세요.
    }
}