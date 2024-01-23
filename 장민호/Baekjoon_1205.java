import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //리스트에 있는 점수 N개
        //새로운 점수
        //리스트에 올라갈 수 있는 점수 P개
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int newScore = sc.nextInt();
        int P = sc.nextInt();

        int answer = -1;
        int drawNum = 0;
        int[] currRanking = new int[P];
        if (N == 0) answer = 1;
        for (int i = 0; i < N; i++) {
            currRanking[i] = sc.nextInt();
            if (newScore > currRanking[i]) {
                answer = i + 1;
                break;
            } else if (newScore == currRanking[i]) {
                if (N != P) {
                    answer = i + 1;
                    break;
                } else if (i == N - 1){
                    drawNum = 0;
                    break;
                } else drawNum--;

            } else if ( i == N - 1 && N < P) answer = N + 1;
        }

        System.out.println(answer + drawNum);

    }
}