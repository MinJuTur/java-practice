package Bronze.Bronze_2.Day3;

import java.util.Scanner;

public class BOJ8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            char[] result = sc.nextLine().toCharArray();
            int score = 0;
            int O_count = 0;

            for (int j = 0; j < result.length; j++) {
                if (result[j] == 'O') {
                    O_count++;
                    score += O_count;
                } else {
                    O_count = 0;
                }
            }
            System.out.println(score);
        }
    }
}