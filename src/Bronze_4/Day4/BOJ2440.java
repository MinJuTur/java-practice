package Bronze_4.Day4;

import java.util.Scanner;

public class BOJ2440 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = N; i > 0; i--) {  // i = 5,4,3,2,1
            for (int j = 0; j < i; j++) {  // i번만큼 반복
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
