package Bronze_5.Day19;

import java.util.Scanner;

public class BOJ2420 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 절댓값: Math.abs() 메서드
        System.out.println(Math.abs(N-M));
    }
}
