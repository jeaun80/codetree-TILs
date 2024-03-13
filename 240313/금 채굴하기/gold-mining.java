import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxProfit = 0;
        for (int K = 0; K <= n; K++) {
            int profit = calculateProfit(grid, m, K);
            maxProfit = Math.max(maxProfit, profit);
        }

        System.out.println(maxProfit);
    }

    public static int calculateProfit(int[][] grid, int m, int K) {
        int n = grid.length;
        int profit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int diamondSum = 0;
                for (int a = -K; a <= K; a++) {
                    for (int b = -K; b <= K; b++) {
                        if (isValid(i + a, j + b, n) && Math.abs(a) + Math.abs(b) <= K) {
                            diamondSum += grid[i + a][j + b];
                            if(i==2 && j==4){
                              //System.out.println("diamondSum = "+diamondSum+" i+a = "+i+a+" j+a ="+j+b+" k = "+K);

                            }

                            

                        }
                    }
                }
                int cost = (int)Math.pow(K, 2) + (int)Math.pow(K + 1, 2);
                if(diamondSum==3){
                   // System.out.println("cost = "+ cost+" K =  "+K);
                }
                if (diamondSum * m >= cost) {
                    if(diamondSum>30){

                    }
                    profit = Math.max(profit, diamondSum);
                }
            }
        }

        return profit;
    }

    public static boolean isValid(int i, int j, int n) {
        return i >= 0 && i < n && j >= 0 && j < n;
    }
}