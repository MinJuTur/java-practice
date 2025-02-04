package AlgorithmCodingTest_JAVA.Chapter2_Sorting;

import java.util.Scanner;

public class Q017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();

        int[] A = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            A[i] = Integer.parseInt(String.valueOf(arr[i]));
        }

        for (int j = 0; j < A.length - 1; j++) {
            int max = Integer.MIN_VALUE;
            int max_index = -1;
            for (int i = j; i < A.length; i++) {
                if (A[i] > max){
                    max = A[i];
                    max_index = i;
                }
            }
            int temp = A[j];
            A[j] = A[max_index];
            A[max_index] = temp;
        }

        for (int i : A) {
            System.out.print(i);
        }

    }
}
