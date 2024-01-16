package study.조성정;

import java.util.Arrays;
import java.util.Scanner;

public class BJ3273 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);

        int x = scan.nextInt();
        int count = 0;

        int left = 0;
        int right = array.length-1;
        while(left < right) {
            if(array[left] + array[right] > x) {
                right--;
            }
            else if(array[left] + array[right] < x) {
                left++;
            }
            else {
                count++;
                left++;
                right--;
            }
        }
        System.out.println(count);
    }
}
