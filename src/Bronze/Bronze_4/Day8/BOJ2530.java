package Bronze.Bronze_4.Day8;

import java.util.Scanner;

public class BOJ2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int H = 0;
        int M = 0;
        int S = C + D;

        if (S >= 60) {
            M = S / 60;
            S = S % 60;
        }
        if (M >= 60) {
            H = M / 60;
            M = M % 60;
        }

        if (H >= 24) {
            H = H % 24;
        }

        System.out.println();
    }
}
