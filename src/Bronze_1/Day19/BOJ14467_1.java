package Bronze_1.Day19;

import java.util.Scanner;

public class BOJ14467_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] A = new int[N+1][2];

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int location = sc.nextInt();

            if (A[num][0] == 0 || A[num][1] != location){
                A[num][0]++;
                A[num][1] = location;
            }
        }

        int count = 0;
        for (int i = 1; i < N+1; i++) {
            if (A[i][0] > 0) A[i][0] --;
            count += A[i][0];
        }
        System.out.println(count);
    }
}
