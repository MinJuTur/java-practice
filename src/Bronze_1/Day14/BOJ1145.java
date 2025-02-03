package Bronze_1.Day14;

import java.util.Scanner;

public class BOJ1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }

        int Max = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (i % A[j] == 0) count++;
                if (count == 3) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
