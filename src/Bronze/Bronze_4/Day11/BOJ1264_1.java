package Bronze.Bronze_4.Day11;

import java.util.Scanner;

public class BOJ1264_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowel = "aeiouAEIOU";
        int count;

        while (true) {
            count = 0;
            String sentence = sc.nextLine();

            if (sentence.equals("#")) {
                break;
            }

            for (char c : sentence.toCharArray()) {
                for (int i = 0; i < vowel.length(); i++) {
                    if (c == vowel.charAt(i)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
