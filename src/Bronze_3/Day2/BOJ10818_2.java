package Bronze_3.Day2;

import java.util.Scanner;

public class BOJ10818_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = Integer.MAX_VALUE; // 가장 큰 값으로 초기화
        int max = Integer.MIN_VALUE; // 가장 작은 값으로 초기화

        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(min + " " + max);
    }
}
