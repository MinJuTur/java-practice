package AlgorithmCodingTest_JAVA.Chapter1_DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Q002_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //과목 개수
        int M = 0; //최대 점수
        double re_sum = 0; //새로운 점수들의 합
        ArrayList<Integer> scores = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();
            scores.add(score);
            if (score > M) M = score;
        }

        for (Integer score : scores) {
            double re_score = (double) score/M *100;
            re_sum += re_score;
        }

        System.out.println(re_sum/N);
    }
}
