package study.조성정;

import java.util.Arrays;
import java.util.Scanner;

public class ProTriangleSnail {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int length = n * (n + 1) / 2;
        int[] answer = new int[length];

        int num = 1;
        int row = 0;
        int col = 0;

        while(num <= length) {
            // 아래 방향
            while(row < n && answer[row*(row+1)/2 + col] == 0) {
                answer[row*(row+1)/2 + col] = num++;
                row++;
            }
            row--;
            col++;

            // 오른 방향
            while(col < n && answer[row*(row+1)/2 + col] == 0) {
                answer[row*(row+1)/2 + col] = num++;
                col++;
            }

            col -= 2;
            row--;
            // 위 방향
            while(row > 0 && answer[row*(row+1)/2 + col] == 0) {
                answer[row*(row+1)/2 + col] = num++;
                row--;
                col--;
            }

            row+=2;
            col++;

        }

        System.out.println(Arrays.toString(answer));
    }
}
