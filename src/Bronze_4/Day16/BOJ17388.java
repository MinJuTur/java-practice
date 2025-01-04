package Bronze_4.Day16;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ17388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            scores[i] = sc.nextInt();
            sum += scores[i];
        }
        if (sum >= 100) {
            System.out.println("OK");
        } else {
            int[] sortedScores = scores.clone();
            Arrays.sort(sortedScores);
            int minScore = sortedScores[0];
            String[] college = {"Soongsil", "Korea", "Hanyang"};
            for (int i = 0; i < 3; i++) {
                if (minScore == scores[i]) {
                    System.out.println(college[i]);
                }
            }

        }
    }
}
