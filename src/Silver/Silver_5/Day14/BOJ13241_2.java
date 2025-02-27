package Silver.Silver_5.Day14;

import java.util.Scanner;

public class BOJ13241_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        if (A > B) {
            long temp = A;
            A = B;
            B = temp;
        }

        System.out.println((A*B)/gcd(A,B));
    }

    private static long gcd(long a, long b) {
        if (a % b == 0) return b;
        return gcd(b, a%b);
    }
}
