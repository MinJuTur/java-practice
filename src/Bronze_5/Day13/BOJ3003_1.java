package Bronze_5.Day13;

import java.util.Scanner;

public class BOJ3003_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            int chess = sc.nextInt();
            if (i < 2) {
                System.out.print(1-chess);
                System.out.print(" ");
            } else if (i < 5) {
                System.out.print(2 - chess);
                System.out.print(" ");
            } else {
                System.out.print(8-chess);
            }
        }
    }
}
