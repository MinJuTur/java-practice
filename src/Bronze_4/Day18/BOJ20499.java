package Bronze_4.Day18;

import java.util.Scanner;

public class BOJ20499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("/");

        int K = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);
        int A = Integer.parseInt(input[2]);

        if (D == 0 || K + A < D) {
            System.out.println("hasu");
        }
        else {
            System.out.println("gosu");
        }
    }
}
