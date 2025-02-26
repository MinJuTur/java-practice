package Silver.Silver_5.Day13;

import java.util.Scanner;

public class BOJ2167_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N+1][M+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int K = sc.nextInt();
        for (int l = 0; l < K; l++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int sum = 0;
            for (int k = 1; k < arr.length; k++) { //N만큼 반복
                for (int m = 1; m < arr[0].length; m++) { //M만큼 반복
                    if (k >= i && k <= x && m >= j && m <= y) sum += arr[k][m];
                }
            }
            System.out.println(sum);
        }
    }
}
