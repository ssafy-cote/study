import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_3273 {
	/*
	 * 2중포문으로 돌리면 10만x10만이라  1억을 훌쩍 넘기므로 시간초과가 남
	 * 배열정렬 후 투포인터
	 */

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int x = Integer.parseInt(br.readLine());
		int ans = 0;
		
		int i=0;
		int j=N-1;
		Arrays.sort(arr);
		
		while (i<j) {
			int sum = arr[i]+arr[j];
			
			if (sum == x) {
				ans+=1;
				i++;
			} else if(sum>x){
				j--;
			} else if(sum<x) {
				i++;
			}			
			
		}
		System.out.println(ans);
		

	}

}
