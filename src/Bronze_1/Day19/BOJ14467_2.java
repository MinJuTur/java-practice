package Bronze_1.Day19;

import java.util.Scanner;

public class BOJ14467_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N+1]; //index:소의 번호, 값:소의 위치+1

        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int location = sc.nextInt();

            if (A[num] != 0 && A[num]-1 != location) count++;
            A[num] = location + 1;
        }
        System.out.println(count);
    }
}
