package Bronze_2.Day18;

import java.util.Scanner;

public class BOJ1075_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();
        long F = sc.nextInt();

        long n = N - (N % 100);
        long f = F;
        long i = 1;
        while (f < n) {
            i++;
            f = F * i;
        }

        long answer = f % 100;
        if (answer < 10) System.out.println("0" + answer);
        else System.out.println(answer);
    }
}
