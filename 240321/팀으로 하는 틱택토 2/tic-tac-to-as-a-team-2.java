import java.io.*;
import java.util.*;

public class Main {
    public static class point{
        int x;
        int y;
        public point(int x,int y){
            this.x = Math.max(x,y);
            this.y = Math.min(x,y);
        }
    }
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int map[][] = new int[3][3];
        for(int i =0;i<3;i++){


            String[]inputStrArr = br.readLine().split("");

            for(int j=0;j<3;j++){
                map[i][j] = Integer.parseInt(inputStrArr[j]); 
            }
        }
        int answer =0;
        Set<point>pointSet = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<3;i++){
            set.add(map[i][0]);
            set.add(map[i][1]);
            set.add(map[i][2]);
            int a[] = new int[2];
            if(set.size()==2){
                int count =0;
                for(int x:set){
                    a[count++] = x;
                }
                int max = Math.max(a[0],a[1]);
                int min = Math.min(a[0],a[1]);
                boolean flag = false;
                for(point p : pointSet){
                    if(p.x==max && p.y==min){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    pointSet.add(new point(max,min));
                    answer++;
                }
            }
            set.clear();
        }
        for(int i=0;i<3;i++){
            set.add(map[0][i]);
            set.add(map[1][i]);
            set.add(map[2][i]);
            int a[] = new int[2];

            if(set.size()==2){
                int count =0;
                for(int x:set){
                    a[count++] = x;
                }
                int max = Math.max(a[0],a[1]);
                int min = Math.min(a[0],a[1]);
                boolean flag = false;
                for(point p : pointSet){
                    if(p.x==max && p.y==min){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    pointSet.add(new point(max,min));
                    answer++;
                }
            }
            set.clear();
        }

        set.add(map[0][0]);
        set.add(map[1][1]);
        set.add(map[2][2]);
        int a[] = new int[2];

        if(set.size()==2){
                int count =0;
                for(int x:set){
                    a[count++] = x;
                }
                int max = Math.max(a[0],a[1]);
                int min = Math.min(a[0],a[1]);
                boolean flag = false;
                for(point p : pointSet){
                    if(p.x==max && p.y==min){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    pointSet.add(new point(max,min));
                    answer++;
                }        }
        set.clear();
        set.add(map[2][0]);
        set.add(map[1][1]);
        set.add(map[0][2]);
        a = new int[2];

        if(set.size()==2){
                int count =0;
                for(int x:set){
                    a[count++] = x;
                }
                int max = Math.max(a[0],a[1]);
                int min = Math.min(a[0],a[1]);
                boolean flag = false;
                for(point p : pointSet){
                    if(p.x==max && p.y==min){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    pointSet.add(new point(max,min));
                    answer++;
                }        }

        System.out.println(answer);
    }
}