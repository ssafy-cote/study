import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
public class Baekjoon_1475
{
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        int[] roomNum = new int[T.length()];
        for ( int i = 0; i < T.length(); i++) {
            roomNum[i] =  T.charAt(i) - '0';

        }

        int[] numSet = new int[10];
        for ( int eachNum : roomNum ) {
            numSet[eachNum]++;
        }
        int currMin = numSet[0];
        for ( int eachNum : numSet ) {
            currMin = Math.min(currMin, eachNum);
        }
        for ( int i = 0; i < numSet.length; i++) {
            numSet[i] -= currMin;
        }
        int currMax = numSet[0];
        for ( int i = 0; i < numSet.length ; i++ ) {
            if (i == 6 || i == 9) continue;
            currMax = Math.max(currMax, numSet[i]);
        }
        if ( (numSet[6] + numSet[9]) % 2 == 1 ) {
            currMax = Math.max(currMax, ((numSet[6] + numSet[9]) / 2) + 1); //
        } else {
            currMax = Math.max(currMax, (numSet[6] + numSet[9]) / 2);
        }
        System.out.println(currMax + currMin);

    }
}