import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashMap<Integer, Integer> numMap = new HashMap<>();

        while(N > 0){
            int input = N % 10;
            if(input == 6) input = 9;
            if(numMap.containsKey(input)) {
                numMap.put(input, numMap.get(input) + 1);
            }
            else numMap.put(input, 1);

            N = N / 10;
        }

        if(numMap.containsKey(9)) 
            numMap.put(9, (int) Math.ceil((double)numMap.get(9) / 2.0));
        int answer = Collections.max(numMap.values());
        System.out.println(answer);

        sc.close();
    }
}