package study.조성정;

import java.util.Scanner;

public class BJ1205 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int newScore = scan.nextInt();
        int p = scan.nextInt();

        int[] scores = new int[n];

        for(int i = 0; i < n; i++) {
            scores[i] = scan.nextInt();
        }

        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(scores[i] < scores[j]) {
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }

        int[] chart = new int[p];

        for(int i = 0; i < p; i++) {
            if(i >= n) {
                chart[i] = -1;
            }
            else {
                chart[i] = scores[i];
            }
        }

        int rank = 1;
        int i;
        for(i = 0; i < p; i++) {
            if(chart[i] > newScore) {
                rank++;
                continue;
            }
            else if(chart[i] == newScore) {
                if(i == p-1) {
                    rank = -1;
                }
                else {
                    continue;
                }
            }
            else  {
                break;
            }

        }
        if(rank > p) {
            rank = -1;
        }
        System.out.println(rank);
    }
}
