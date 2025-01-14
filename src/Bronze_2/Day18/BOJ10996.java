package Bronze_2.Day18;

import java.util.Scanner;

public class BOJ10996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < 2*N; i++) { //가로 줄 인덱스
            for (int j = 0; j < N; j++) { //가로 줄 한 개 내부 인덱스
                if ((i + j) % 2 == 0) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}