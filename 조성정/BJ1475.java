package study.조성정;

import java.util.Scanner;

public class BJ1475 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String org = Integer.toString(n);
        int[] room = new int[org.length()];
        for(int i = org.length()-1; i >= 0; i--) {
            room[i] = n%10;
            n /= 10;
        }
        int[] check = new int[10];
        int max = 0;

        for(int i = 0; i < room.length; i++) {
            int temp = room[i];

            if(temp == 6 || temp == 9) {
                if(check[6] > check[9]) {
                    check[9]++;
                }
                else {
                    check[6]++;
                }
            }
            else {
                check[temp]++;
            }
        }

        for(int i = 0; i < 10; i++) {
            if(max < check[i]) {
                max = check[i];
            }
        }

        System.out.println(max);
    }
}
