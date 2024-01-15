import java.io.*;

public class 방번호 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String roomNumber = br.readLine();
        int[] set = new int[10];
        int answer = 0;

        for(char room : roomNumber.toCharArray()) {
            int oneNumber = room - '0';
            if (oneNumber == 6) {
                set[9]++;
            } else {
                set[oneNumber]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                answer = Math.max(answer, (set[9] / 2) + (set[9] % 2));
            } else {
                answer = Math.max(answer, set[i]);
            }
        }
        System.out.println(answer);
    }
}