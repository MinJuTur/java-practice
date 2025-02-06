package Bronze.Bronze_1.Day15;

import java.util.Scanner;

public class BOJ1236_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //세로
        int M = sc.nextInt(); //가로

        int[] rCnt = new int[N];
        int[] cCnt = new int[M];
        for (int i = 0; i < N; i++) {
            char[] temp = sc.next().toCharArray();
            for (int j = 0; j < M; j++) {
                if (temp[j] == 'X') {
                    rCnt[i]++;
                    cCnt[j]++;
                }
            }
        }

        int rResult = 0;
        for (int i = 0; i < N; i++) {
            if (rCnt[i] == 0) rResult++;
        }

        int cResult = 0;
        for (int i = 0; i < M; i++) {
            if (cCnt[i] == 0) cResult++;
        }

        System.out.println(Math.max(rResult, cResult));
    }
}
