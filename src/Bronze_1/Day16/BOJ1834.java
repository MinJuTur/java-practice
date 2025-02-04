package Bronze_1.Day16;

import java.util.Scanner;

public class BOJ1834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();

        long sum = 0;

        for (int i = 1; i < N; i++) {
            sum += N*i + i;
        }
        System.out.println(sum);
    }
}
