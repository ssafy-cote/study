import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        
        int l = 0;
        int r = n - 1;
        int answer = 0;
        Arrays.sort(arr);
        
        while (l < r) {
        	int sum = arr[l] + arr[r];
        	
        	if (sum == x) {
        		l++;
        		r--;
        		answer++;
        	} else if (sum < x) {
        		l++;
        	} else if (sum > x) {
        		r--;
        	}
        }
        System.out.println(answer);
    }
}
