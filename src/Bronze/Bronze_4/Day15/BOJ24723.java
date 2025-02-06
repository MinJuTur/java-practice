package Bronze.Bronze_4.Day15;

import java.util.Scanner;

public class BOJ24723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int answer = 1;

        for (int i = 0; i < N; i++) {
            answer *= 2;
        }

        System.out.println(answer);
    }
}
