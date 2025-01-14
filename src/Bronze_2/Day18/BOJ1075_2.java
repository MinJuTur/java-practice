package Bronze_2.Day18;

import java.util.Scanner;

public class BOJ1075_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();
        long F = sc.nextInt();

        long n = N - (N % 100);
        while ((n % F != 0)) {
            n++;
        }

        long answer = n % 100;
        if (answer < 10) System.out.println("0" + answer);
        else System.out.println(answer);
    }
}