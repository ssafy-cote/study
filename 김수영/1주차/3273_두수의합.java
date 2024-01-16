package study;
import java.util.Scanner;

public class SumOfTwoNums {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); // 배열 길이
		
		int[] arr = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = s.nextInt();
		}
		
		int x = s.nextInt();
		int count = 0;
		int subNum = 0;
		
		for(int i=0 ; i<N ; i++) {
			subNum = x - arr[i];
			for (int j=i+1 ; j<N ; j++) {
				if(subNum != arr[j])continue;
				count += 1;
				break;
			}
		}
		System.out.println(count);
		
	}
}
