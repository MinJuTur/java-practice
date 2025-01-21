package Bronze_1.Day7;

import java.util.Scanner;

public class BOJ2163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println((N-1) + N*(M-1));
    }
}