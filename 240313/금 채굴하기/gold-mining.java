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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int K = 0; K < n; K++) {
                    int profit = calculateProfit(grid, m, i, j, K);
                    maxProfit = Math.max(maxProfit, profit);
                }
            }
        }

        System.out.println(maxProfit);
    }

    public static int calculateProfit(int[][] grid, int m, int centerX, int centerY, int K) {
        int n = grid.length;
        int profit = 0;

        for (int i = centerX - K; i <= centerX + K; i++) {
            for (int j = centerY - K; j <= centerY + K; j++) {
                if (isValid(i, j, n)) {
                    int diamondSum = 0;
                    boolean isValidDiamond = true;
                    for (int a = centerX - i; a <= centerX + i; a++) {
                        for (int b = centerY - j; b <= centerY + j; b++) {
                            if (isValid(a, b, n)) {
                                diamondSum += grid[a][b];
                                if (grid[a][b] == 0) {
                                    isValidDiamond = false;
                                }
                            }
                        }
                    }
                    int cost = (int) Math.pow(K, 2) + (int) Math.pow(K + 1, 2);
                    if (isValidDiamond && diamondSum * m >= cost) {
                        profit = Math.max(profit, diamondSum);
                    }
                }
            }
        }

        return profit;
    }

    public static boolean isValid(int i, int j, int n) {
        return i >= 0 && i < n && j >= 0 && j < n;
    }
}