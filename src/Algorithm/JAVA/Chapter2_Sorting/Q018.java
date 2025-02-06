package Algorithm.JAVA.Chapter2_Sorting;

import java.util.Scanner;

public class Q018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int now = 1; now < N; now++) {
            for (int i = now - 1; i >= 0 ; i--) {
                if (A[i] > A[now]) {
                    int temp = A[now];
                    for (int j = now - 1; j >= i - 1 ; j--) {
                        A[j+1] = A[j];
                    }
                    A[i] = temp;
                }
            }
        }
    }
}
