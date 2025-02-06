package Bronze.Bronze_4.Day1;

import java.util.Scanner;

public class BOJ2439_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = N ; i > 0 ; i--) { // N .. 4 3 2 1 (행)
            for (int j = 1; j <= N; j++) { // 1 2 3 4 .. N (열)
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
