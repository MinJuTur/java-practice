package Bronze_4.Day19;

import java.util.Scanner;

public class BOJ4299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int diff = sc.nextInt();

        int A = (sum + diff) / 2;
        int B = (sum - diff) / 2;

        //diff > sum 인 경우: A < 0 또는 B < 0
        if (diff > sum || A + B != sum || A - B != diff) {
            System.out.println(-1);
        } else if (A >= B) {
            System.out.println(A + " " + B);
        } else {
            System.out.println(B + " " + A);
        }
    }
}
