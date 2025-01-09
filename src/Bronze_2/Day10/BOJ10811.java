package Bronze_2.Day10;

import java.util.Scanner;

public class BOJ10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //바구니 개수
        int M = sc.nextInt(); //역순 바꾸는 횟수

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int num1 = sc.nextInt() - 1;
            int num2 = sc.nextInt() - 1;

            int n; //리스트 내 교환 횟수
            int diff = num2 - num1;
            if ((num2 - num1) % 2 != 0) n = diff/ 2 + 1;
            else n = diff/ 2;

            for (int j = 0; j < n; j++) {
                int temp = A[num1];
                A[num1] = A[num2];
                A[num2] = temp;

                num1++;
                num2--;
            }
        }

        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
