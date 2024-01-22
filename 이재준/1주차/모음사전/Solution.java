package 모음사전;
/*
 * 1. 빈 string 생성
 * 2. A,E,I,O,U배열 생성
 * 3. bfs함수 생성
 *     3.1. for문을 돌면서 A,E,I,O,U를 반복하면 추가
 *     3.2. 길이가 5가 되면 정지
 *     3.3. 찾고있는 글자와 일치해도 정지
 *     3.4. 현재까지의 answer에 넣기
 * 4.출력 
 */
public class Solution {
    static String[] moumm = {"A","E","I","O","U"};
    static int answer = 0;
    static String answerWord = "";
    static public boolean bfs(String arr,int arrLength) {
        if(arr.equals(answerWord)) {
            return true;
        }
        if(arrLength ==5) {
            return false;
        }
        for(int i = 0;i < 5; i++) {
            String temp = arr;
            arr+=moumm[i];
            answer++;
            if(bfs(arr,++arrLength)) return true;
            arr=temp;
            arrLength--;
        }
        return false;
    }
    static public int solution(String word) {
        answerWord = word;
        bfs("",0);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("I"));
    }

}