package Silver.Silver_5.Day8;

import java.util.Scanner;

public class BOJ1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;

        int[][] arr = new int[101][101];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    arr[x+j][y+k] = 1;
                }
            }
        }

        for (int i = 1; i < 101; i++) {
            for (int j = 1; j < 101; j++) {
                if (arr[i][j] == 1) sum++;
            }
        }
        System.out.println(sum);
    }
}
