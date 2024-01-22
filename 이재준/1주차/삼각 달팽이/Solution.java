package 삼각달팽이;
/*
 * 1. (n+1)(n)/2 배열 생성
 * 2. 0번 인덱스에서 시작한다고 가정
 * 3. 이동
 *     3.1. 왼쪽 대각으로 이동 -> 이동을 할 수록 1칸씩 더 이동을 하게됨
 *         3.1.1. 바퀴가 진행됨에 따라 이동하는 칸수가 2씩 증가
 *         3.3.2. 바퀴가 진행됨에 따라 3씩 덜 이동하게됨
 *  3.2. 우측으로 이동 -> 1칸씩 이동
 *      3.2.1. 바퀴가 진행됨에 따라 3씩 덜 이동하게됨
 *  3.3. 위쪽 대각으로 이동 -> 이동을 할 수록 -1칸씩 더 이동을 하게됨
 *      3.3.1. 바퀴가 진행됨에 따라 3씩 덜 이동하게됨
 * 4. 이동을 하면서 1씩 증가시킨 값을 넣기
 * 5. count값이 최대 값에 도달시 중단
 * 6. 배열 출력
 */
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.*;
public class Solution {
    public int[] solution(int N) {
        //k 왼쪽 대각으로 이동시 바퀴가 진행함에 따라 이동 칸수가 2씩 증가
        int k =0;
        // l 바퀴가 진행함에 따라 3씩 덜 이동하게 됨
        int l =0;
        // m 위쪽 대각으로 이동시 -1칸씩 덜 이동하게됨
        int m = 1;
        //시작 위치[0]
        int start = 0;
        // 배열 생성
        int[] arr = new int[(N+1)*N/2];
        // count최대값
        int maxCount =(N+1)*N/2;
        //1부터 넣기 시작
        int count =1;
        //이동 시작
        A:while(true) {
            //왼쪽 대각으로 이동
            for(int j = k;j<N+k-l;j++) {
                arr[start += j] = count++; 
                if(count>maxCount) break A;
            }
            //우측으로 이동
            for(int j = 0;j<N-l-1;j++) {
                arr[start += 1] = count++;
                if(count>maxCount) break A;
            }
            //위쪽 대각으로 이동
            for(int j = N+1-m;4-m+l<=j ;j--) {
                arr[start -= j] = count++;
                if(count>maxCount) break A;
            }
            l+=3;
            m++;
            k+=2;
        }
        return arr;
    }
}