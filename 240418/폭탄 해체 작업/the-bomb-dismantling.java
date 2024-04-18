import java.util.Scanner;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> { 
    int timeLimit, score;
    public Pair(int timeLimit, int score) { 
        this.timeLimit = timeLimit; 
        this.score = score; 
    }
    @Override
    public int compareTo(Pair b) {
        if(timeLimit != b.timeLimit) return timeLimit - b.timeLimit;
        return score - b.score;
    }
}

public class Main {
    public static final int MAX_T = 10000;
    public static final int MAX_N = 10000;
    
    // 변수 선언
    public static int n;
    public static Pair[] bombs = new Pair[MAX_N];
    
    // 폭탄 번호가 주어졌을 때
    // 해당 폭탄의 시간제한을 반환합니다.
    public static int getTimeLimit(int bombIdx) {
        int timeLimit = bombs[bombIdx].timeLimit;
    
        return timeLimit;
    }
    
    // 폭탄 번호가 주어졌을 때
    // 해당 폭탄 해체시 얻게 되는 점수를 반환합니다.
    public static int getScore(int bombIdx) {
        int score = bombs[bombIdx].score;
        
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int score = sc.nextInt();
            int timeLimit = sc.nextInt();
            // 시간을 기준으로 정렬해야 하므로
            // timeLimit을 첫 번째 자리에 넣어줍니다.
            bombs[i] = new Pair(timeLimit, score);
        }

        // 시간을 기준으로 오름차순 정렬해줍니다.
        Arrays.sort(bombs, 0, n);

        // MAX_T부터 1까지 보며
        // 해당 시간에 해체했을 때 가장 점수를 많이 얻을 수 있는 폭탄을 골라줍니다.
        // 이렇게 진행하는 방법이 항상 최선의 답을 구해줌을 이용합니다.
        // 이때 가능한 폭탄 중 최대 점수를 갖는 폭탄을 빠르게 골라주기 위해
        // 우선순위 큐를 이용합니다.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int bombIdx = n - 1;
        int ans = 0;

        for(int t = MAX_T; t >= 1; t--) {
            // t초에 해체가 가능한 폭탄들을
            // 전부 우선순위 큐에 담아줍니다.
            while(bombIdx >= 0 && getTimeLimit(bombIdx) >= t) {
                pq.add(-getScore(bombIdx));
                bombIdx--;
            }

            // 현재 시간에 해체 가능한 폭탄이 존재한다면
            // 그 중 가장 높은 점수를 얻을 수 있는 폭탄을 해체해줍니다.
            if(!pq.isEmpty()) {
                ans += -pq.poll();
            }
        }

        System.out.print(ans);
    }
}