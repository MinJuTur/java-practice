package AlgorithmCodingTest_JAVA.Chapter1_DataStructure;

import java.util.Scanner;

public class Q002_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //과목 개수
        int M = 0; //최대 점수
        int sum = 0; //과목 점수의 합

        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();
            sum += score;
            if (score > M) M = score;
        }

        double average = (double) sum * 100 / M / N;
        System.out.println(average);
    }
}
