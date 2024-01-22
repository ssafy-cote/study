package study.조성정;

import java.util.Arrays;
import java.util.Scanner;

public class ProVowelDict {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int answer = 0;
        String[] vowel = new String[]{"A", "E", "I", "O", "U"};
        String[] str = new String[3905];

        int count = 0;

        for (int i = 0; i < 5; i++) {
            str[count] = vowel[i];
            count++;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                str[count] = vowel[i] + vowel[j];
                count++;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    str[count] = vowel[i] + vowel[j] + vowel[k];
                    count++;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        str[count] = vowel[i] + vowel[j] + vowel[k] + vowel[l];
                        count++;
                    }
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        for (int m = 0; m < 5; m++) {
                            str[count] = vowel[i] + vowel[j] + vowel[k] + vowel[l] + vowel[m];
                            count++;
                        }
                    }
                }
            }
        }

        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(word)) {
                answer = i+1;
                break;
            }
        }
        System.out.println(answer);
    }
}
