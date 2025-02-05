package Bronze_1.Day17;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }

        while (true) {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] > A[i+1]) swap(A, i);
            }
            if (Arrays.equals(A, new int[]{1, 2, 3, 4, 5})) break;
        }
    }

    private static void swap(int[] A, int i) {
        int temp = A[i];
        A[i] = A[i+1];
        A[i+1] = temp;

        for (int a : A) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
