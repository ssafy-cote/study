public class Main {
    public static int solution(String word) {
        double answer = 1;
        char[] alphabets= {'A', 'E', 'I', 'O', 'U'};
        //가장 하위 문자부터
        for ( int i = word.length() - 1; i >=0; i--) {
            //각 글자가 사전순으로 몇번째냐?
            for ( int j = 0; j < 5; j++) {
                if (alphabets[j] == word.charAt(i)) {
                    //바로 상위 글자까지 같고 맨뒷자리만 앞에 있는 경우 ( 자릿수 -1인 경우 포함)
                }
            }
        }
        return lowerDimension(alphabets, word, answer);
    }

    public static int lowerDimension(char[] alphabets, String word, double answer) {
        if (word.length() == 0) return 0;
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] == word.charAt(0)) {
                //첫문자가 사전 순 앞에 있는 애들 다세기 : 첫문자 I면 A, E로 셀수 있는 모든 경우의 수
                 for (int j = 0; j < i; j++) {
                    //첫문자 alphabet[J]이고 첫문자 빼고 길이 0~word.length - 1까지 다셈
                    //길이 0 : 5^0개
                    //길이 1 : 5^1개
                    //길이 2 : 5^2개 ...
                    for (int k = 0; k < 5; k++) {
                        answer += Math.pow(5, j);
                    }
                }
                answer += lowerDimension(alphabets, word.substring(1), answer);
                break;
            }
        }
        //첫문자가 같고 뒷문자가 앞에 있는 애들
        //얘넨 다른 방식으로 세야됨
        //A가 많을수록 무조건 앞에있음
        //두번째가 E라는건 앞에서 _A___, _A__, _A_, _A 는 다 셌다는 의미
        //재귀 ㄱㄱ
        //answer += lowerDimension(alphabets, word.substring(1), answer);
        return (int)answer;
    }
    public static void main(String[] args) {
        System.out.println(dictionary("AAAAE"));

    }

    public static int dictionary(String word) {
        int answer = 0;
        char[] alphabets= {'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabets.length; j++) {
                if (word.charAt(i) == alphabets[j]) {
                    for ( int k = 0; k <= i; k++) {
                        if (i == word.length() - 1) {
                            answer += j + 2;
                        } else answer += (j + 1) * Math.pow(5, k);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}