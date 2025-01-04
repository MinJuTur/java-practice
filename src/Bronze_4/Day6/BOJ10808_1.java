package Bronze_4.Day6;

import java.util.Scanner;

public class BOJ10808_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int[] alphabets = new int[26];

        for (char w : word.toCharArray()) {
            for (int i = 0; i < alphabets.length; i++) {
                // value => index 변환
                if (w == (char) (97 + i)) {
                    alphabets[i]++;
                }
            }
        }

        for (int alphabet : alphabets) {
            System.out.print(alphabet + " ");
        }
    }
}
