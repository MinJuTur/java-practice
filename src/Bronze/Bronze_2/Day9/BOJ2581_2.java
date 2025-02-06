package Bronze.Bronze_2.Day9;

import java.util.Scanner;

public class BOJ2581_2 {
    public static void main(String[] args) {
        int[] A = new int[10001];
        for (int i = 2; i < 10001; i++) {
            A[i] = i;
        }

        for (int i = 2; i < Math.sqrt(10001); i++) { //제곱근까지만 돌아도 소수는 모두 판정난다.
            if (A[i] == i) { //소수 일 때
                for (int j = i+i; j < 10001; j+=i) { //소수의 배수는 소수가 아니므로 0으로 바꿈
                    A[j] = 0;
                }
            }
        }

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = 0;

        for (int i = N; i >= M ; i--) {
            if (A[i] != 0) {
                sum += A[i];
                min = A[i];
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}