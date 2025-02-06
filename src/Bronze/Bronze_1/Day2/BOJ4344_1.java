package Bronze.Bronze_1.Day2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BOJ4344_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            int N = sc.nextInt();

            int[] arr = new int[N]; //N명 학생의 점수
            int sum = 0;
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            double average  = (double) sum / N; //평균
            int averageOverCount = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j] > average) averageOverCount++;
            }
            double portion = (double) averageOverCount / N * 100;
            BigDecimal rounded = new BigDecimal(portion).setScale(3, RoundingMode.HALF_UP);
            System.out.println(rounded + "%");
        }
    }
}
