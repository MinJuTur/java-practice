package Silver.Silver_5.Day15;

import java.util.Scanner;

public class BOJ2740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        sc.nextInt(); //M 입력 중복
        int K = sc.nextInt();

        int[][] B = new int[M][K];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < K; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int h = 0; h < K; h++) {
                int sum = 0;
                for (int j = 0; j < M; j++) {
                    sum += A[i][j] * B[j][h];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
