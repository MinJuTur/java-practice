package Bronze.Bronze_4.Day6;

import java.util.Scanner;

public class BOJ10808_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int[] alphabets = new int[26];

        for (int i = 0; i < word.length(); i++) {
            alphabets[word.charAt(i)-97]++;
        }

        for (int alphabet : alphabets) {
            System.out.print(alphabet + " ");
        }
    }
}
