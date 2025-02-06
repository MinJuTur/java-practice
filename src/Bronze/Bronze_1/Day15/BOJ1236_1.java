package Bronze.Bronze_1.Day15;

import java.util.Scanner;

public class BOJ1236_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //세로
        int M = sc.nextInt(); //가로

        int count1 = 0;
        char[][] A = new char[N][M];
        for (int i = 0; i < N; i++) {
            boolean isNone = true;
            String temp = sc.next();
            for (int j = 0; j < M; j++) {
                A[i][j] = temp.charAt(j);
                if (A[i][j] == 'X') {
                    isNone = false;
                }
            }
            if (isNone) count1++;
        }

        int count2 = 0;
        for (int j = 0; j < M; j++) {
            boolean isNone = true;
            for (int i = 0; i < N; i++) {
                if (A[i][j] == 'X') {
                    isNone = false;
                    break;
                }
            }
            if (isNone) count2++;
        }

        System.out.println(Math.max(count1,count2));
    }
}
