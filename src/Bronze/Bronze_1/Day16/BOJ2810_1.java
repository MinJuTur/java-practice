package Bronze.Bronze_1.Day16;

import java.util.Scanner;

public class BOJ2810_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] A = sc.next().toCharArray();

        int count = 1;
        int LCnt = 0;
        for (int i = 0; i < N; i++) {
            char temp = A[i];

            if (temp == 'S') {
                count++;
            } else if (temp == 'L') {
                LCnt++;
                if (LCnt % 2 == 0) count++;
            }
        }
        System.out.println(Math.min(count, N));
    }
}
