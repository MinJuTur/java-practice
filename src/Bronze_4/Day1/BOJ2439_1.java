package Bronze_4.Day1;

import java.util.Scanner;

public class BOJ2439_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1 ; i <= N ; i++) {
            System.out.print(" ".repeat(N-i));
            System.out.print("*".repeat(i));
            System.out.println();
        }
    }
}
