// 메서드 사용하여 연습!

package study.조성정;

import java.util.Scanner;

public class SW12712M {
    public static int search(int[][] array, int n, int m) {
        int max = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int [] r_index = {-1, 1, 0, 0};
                int [] c_index = {0, 0, -1, 1};
                int temp = array[i][j];
                for(int k = 1; k < m; k++) {
                    for(int l = 0; l < 4; l++) {
                        int r = i + k * r_index[l];
                        int c = j + k * c_index[l];

                        if(r >= 0 && r < n && c >= 0 && c < n) {
                            temp += array[r][c];
                        }
                    }
                }
                if(temp >= max) {
                    max = temp;
                }
            }
        }
        return max;
    }

    public static int xSearch(int[][] array, int n, int m) {
        int max = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int [] r_index = {-1, 1, -1, 1};
                int [] c_index = {-1, -1, 1, 1};
                int temp = array[i][j];
                for(int k = 1; k < m; k++) {
                    for(int l = 0; l < 4; l++) {
                        int r = i + k * r_index[l];
                        int c = j + k * c_index[l];

                        if(r >= 0 && r < n && c >= 0 && c < n) {
                            temp += array[r][c];
                        }
                    }
                }
                if(temp >= max) {
                    max = temp;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) throws Exception  {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[][] array = new int[n][n];
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    array[j][k] = scan.nextInt();
                }
            }

            int max_search = search(array, n, m);
            int max_xSearch = xSearch(array, n, m);
            int max = Math.max(max_search, max_xSearch);

            System.out.println("#" + i + " " + max);
        }
    }
}
