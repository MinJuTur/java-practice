package Bronze_4.Day9;

import java.util.Scanner;

public class BOJ2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int P = sc.nextInt();
        int people = L * P;

        for (int i = 0; i < 5; i++) {
            System.out.println(sc.nextInt() - people);
        }
    }
}