package Bronze.Bronze_2.Day11;

import java.util.Scanner;

public class BOJ2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] N = sc.next().toCharArray(); //주어진 숫자
        int B = Integer.parseInt(sc.next()); //진법
        int result = 0;

        for (int i = 0; i < N.length; i++) { //주어진 숫자의 각 자리 돌기
            int temp; //주어진 숫자가 의미하는 것
            if (N[i] >= 'A') temp = N[i] - 'A' + 10;
            else temp = Integer.parseInt(String.valueOf(N[i]));

            result += temp * Math.pow(B, N.length - (i+1));
        }
        System.out.println(result);
    }
}
