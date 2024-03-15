import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] strsizeArr = br.readLine().split(" ");

        int n = Integer.parseInt(strsizeArr[0]);
        int m = Integer.parseInt(strsizeArr[1]);

        int map[][] = new int[n][m];
        boolean checkMap[][];
        int answer =Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            String[] inputStrArr = br.readLine().split(" ");
            for(int j=0;j<m;j++){
                map[i][j] = Integer.parseInt(inputStrArr[j]);
            }
        }

        //input finish


        //index_search start 시작점 선택
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                //boxSize_choice start 박스사이즈선택
                int f_sum = 0;
                int s_sum = 0;
                for(int boxi=0;boxi<n;boxi++){
                    for(int boxj=0;boxj<m;boxj++){
                        checkMap = new boolean [n][m];
                        //first_mapcheck start 선택한 사이즈만큼 맵체크
                        f_sum = 0;
                        int f=0;
                        for(int a = i;a<=boxi+i;a++){
                            for(int b= j;b<=boxj+j;b++){
                                
                                if(a<n && b<m && a>=0 && b>=0){
                                    checkMap[a][b] = true;
                                    f_sum+=map[a][b];
                                }
                                else{
                                    f= 1;
                                    break;
                                }
                            }
                            if(f==1){
                                break;
                            }
                        }
                        if(f==1){
                            continue;
                        }

                        //second_search start 두번째 박스 시작점 선택
                        for(int s_i=0;s_i<n;s_i++){
                            for(int s_j = 0;s_j<m;s_j++){
                                

                                //second_boxSize_choice start 두번째 박스사이즈 선택
                                for(int s_boxi=0;s_boxi<n;s_boxi++){
                                    for(int s_boxj=0;s_boxj<m;s_boxj++){
                                        s_sum = 0;
                                        //second_mapcheck start 선택사이즈만큼 맵체크
                                        boolean checkFalg = false;
                                        for(int a = s_i;a<=s_boxi;a++){
                                            for(int b= s_j;b<=s_boxj;b++){
                                                if(checkMap[a][b]){
                                                    //System.out.println(a+" "+b);
                                                    
                                                    checkFalg = false;
                                                    break;
                                                }
                                                else{
                                                    s_sum+=map[a][b];
                                                    checkFalg =true;
                                                    //System.out.println("di");
                                                }
                                            }
                                            if(!checkFalg){
                                                break;
                                            }
                                        }
                                        if(checkFalg){
                                            answer = Math.max(answer,s_sum+f_sum);
                                        }
                                    }
                                }
                            }
                        }

                        
                    }
                }




            }
        }
        System.out.println(answer);



        // 여기에 코드를 작성해주세요.
    }
}