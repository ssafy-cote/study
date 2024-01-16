package com.problem.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		
		int[] arr = new int[10];
		
		for(int i=0 ; i<input.length(); i++) {
			arr[(int)input.charAt(i) - '0']++;
		}
		System.out.println(Arrays.toString(arr));
		int tmp = arr[6] + arr[9];
		if (tmp % 2 == 1)
			tmp = tmp / 2 + 1;
		else
			tmp /= 2;
		arr[6] = tmp;
		arr[9] = tmp;
		int max = Integer.MIN_VALUE;
		for(int i: arr) {
			if (i > max)
				max = i;
		}
		System.out.println(max);
	}

}
