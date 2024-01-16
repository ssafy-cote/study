//package test;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_3273 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for ( int i = 0; i < len; i++ ) {
			arr[i] = sc.nextInt();
		}
		int X = sc.nextInt();
		int count = 0;
		
		for ( int i = 0; i < len; i++ ) {
			for ( int j = i + 1; j < len; j++ ) {
				if (arr[i] + arr[j] == X ) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);

	}

}
