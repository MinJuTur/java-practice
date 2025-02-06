package Bronze.Bronze_2.Day2;

import java.util.Scanner;

public class BOJ2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.next());

        for (int i = 0; i < T; i++) {
            int R = Integer.parseInt(sc.next());
            char[] S = sc.next().toCharArray();

            for (char c : S) {
                for (int j = 0; j < R; j++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
