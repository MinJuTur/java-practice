package Bronze_4.Day20;

import java.util.Scanner;

public class BOJ17362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = n % 8;

        if (num == 1) {
            System.out.println(1);
        }
        if (num == 0 || num == 2) {
            System.out.println(2);
        }
        if (num == 3 || num == 7) {
            System.out.println(3);
        }
        if (num == 4 || num == 6) {
            System.out.println(4);
        }
        if (num == 5) {
            System.out.println(5);
        }
    }
}
