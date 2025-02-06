package Algorithm.JAVA.Chapter2_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q015 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(bf.readLine());
        }

        for (int i = N - 1; i > 0; i--) {
            boolean isDone = true;
            for (int j = 0; j < i; j++) {
                if (A[j] > A[j+1]) {
                    isDone = false;
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j+1] = temp;
                }
            }
            if (isDone) break;
        }
        for (int i : A) {
            System.out.println(i);
        }
    }
}
