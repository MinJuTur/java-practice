package Bronze_1.Day2;

import java.util.Scanner;

public class BOJ4344_2 {
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
            //Math.round() 메서드: 소수점 첫 번째 자리에서 반올림 -> 셋째 자리에서 반올림하기 위해 *1000
            System.out.println(Math.round(portion*1000)/1000.0 + "%");
        }
    }
}
