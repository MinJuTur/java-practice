package Bronze_4.Day7;

import java.util.Scanner;

public class BOJ2752_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = Math.min(a, Math.min(b, c));
        System.out.print(min + " ");

        if (min == a) {
            System.out.print(Math.min(b, c) + " ");
            System.out.print(Math.max(b, c) + " ");
        } else if (min == b) {
            System.out.print(Math.min(a, c) + " ");
            System.out.print(Math.max(a, c) + " ");
        } else {
            System.out.print(Math.min(a, b) + " ");
            System.out.print(Math.max(a, b) + " ");
        }
    }
}
