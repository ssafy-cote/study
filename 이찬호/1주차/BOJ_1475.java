import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1475 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		
		int[] nums = new int[10];
		int ans = 1;
		
		
		for (int i=0; i<N.length(); i++) {
			nums[N.charAt(i)-'0']++;			
		}
		
		for (int i=0; i<10; i++) {
			int temp = 0;
			if (i==6||i==9) {
				temp = (nums[6]+nums[9])/2 + (nums[6]+nums[9])%2;
			} else {
				temp = nums[i];
			}
			if (ans<temp) ans = temp;
		}
		System.out.println(ans);
		
		
		
		
		
	}

}