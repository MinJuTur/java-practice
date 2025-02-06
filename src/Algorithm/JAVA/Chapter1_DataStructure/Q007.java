package Algorithm.JAVA.Chapter1_DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class Q007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int i = 1;
        int j = N;
        int count = 0;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum < M) i++;
            else if (sum > M) j--;
            else if (sum == M) {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
