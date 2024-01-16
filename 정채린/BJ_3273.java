package study.정채린;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_3273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        Arrays.sort(arr);

        int ans = 0;
        int left = 0, right = N - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == X) {
                ans++;
                left++;
                right--;
            } else if (sum < X) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(ans);
    }
}
