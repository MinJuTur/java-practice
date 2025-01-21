package UOSPC2024;

import java.util.Scanner;

public class BOJ32930 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N+M][2];
        double max = Double.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            double sum = Math.pow(arr[i][0], 2) + Math.pow(arr[i][1], 2);
            if (sum > max){
                max = sum;
                maxIndex = i;
            }

        }

        int x = arr[maxIndex][0];
        int y = arr[maxIndex][1];
        for (int i = 0; i < M; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            double sum = Math.pow(arr[i][0] - x, 2) + Math.pow(arr[i][1] - y, 2);
            if (sum > max){
                max = sum;
            }
        }
    }
}
