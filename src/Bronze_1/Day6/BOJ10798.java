package Bronze_1.Day6;

import java.util.Scanner;

public class BOJ10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] A = new String[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextLine();
        }

        for (int i = 0; i <= 15; i++) {
            for (String s : A) {
                if (s.length() - 1 >= i) System.out.print(s.charAt(i));
            }
        }
    }
}