package AlgorithmCodingTest_JAVA.Chapter2_Sorting;

import java.util.Scanner;

public class Q018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int index = 1; index < N; index++) {
            for (int i = index - 1; i >= 0 ; i--) {
                if (A[i] < A[index]) {
                    for (int j = i+1; j < N; j++) {
                        int temp = A[j+1];
                        A[j+1] = A[j];
                    }
                    int temp = A[index];
                    A[index] = A[i+1];
                    A[i+1] = temp;
                }
            }
        }
    }
}
