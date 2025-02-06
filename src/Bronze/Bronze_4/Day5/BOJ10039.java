package Bronze.Bronze_4.Day5;

import java.util.Scanner;

public class BOJ10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalScore = 0;
        for (int i = 0; i < 5; i++) {
            int score = sc.nextInt();
            if (score < 40) {
                score = 40;
            }
            totalScore += score;
        }
        System.out.println(totalScore/5);
    }
}
