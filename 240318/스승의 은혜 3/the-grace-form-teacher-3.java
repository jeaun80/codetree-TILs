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
        /*Collections.sort(wishList,new Comparator<wish>(){
            @Override
            public int compare(wish o1,wish o2){
                if((o1.wishPrice+o1.shipping)==(o2.wishPrice+o2.shipping)){
                    return o2.wishPrice-o1.wishPrice;
                }
                else{
                    return (o1.wishPrice+o1.shipping) - (o2.wishPrice+o2.shipping);
                }
            }
        });
        */
        int answer =0;

        for(int coupon=0;coupon<studentNum;coupon++){
            int mPrcie=price;

            List<Integer>list = new ArrayList<>();
            for(int st=0;st<studentNum;st++){//가격게산
                int midprice = wishList.get(st).wishPrice;
                int shipping = wishList.get(st).shipping;
                if(st==coupon){
                    midprice/=2;
                }
                int wishPrice = midprice+shipping;
                list.add(wishPrice);
            }
            
            Collections.sort(list);
            int sum =0;
            for(int i=0;i<studentNum;i++){
                sum+=list.get(i);
                //System.out.println(list.get(i));
                if(sum>price){
                    answer = Math.max(answer,i);
                    break;
                }
            }

            if(sum==price){
                answer = studentNum;
            }
            //System.out.println(answer);  
        }
        //if(answer ==0){
         //   answer = studentNum;
        //}

        System.out.println(answer);
        // 여기에 코드를 작성해주세요.
    }
}