import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < N; i++) {
			numsMap.put(sc.nextInt(), 1);
		}
		
		int X = sc.nextInt();
		int answer = 0;
		
		for(Integer i: numsMap.keySet()) {
			int findNumber = X - i;
			if(numsMap.containsKey(findNumber)) answer += 1;
		}
		System.out.println(answer / 2);
		sc.close();
	}
}