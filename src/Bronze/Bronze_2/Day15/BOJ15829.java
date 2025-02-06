package Bronze.Bronze_2.Day15;

import java.util.Scanner;

public class BOJ15829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = Integer.parseInt(sc.next());
        char[] temps = sc.next().toCharArray();
        long sum = 0;
        long M = 1234567891;
        int r = 31;

        for (int i = 0; i < L; i++) {
            long temp = temps[i] - 'a' + 1;
            long a = 1;
            //r의 거듭제곱을 M으로 나눈 나머지로 구해야 long 범위를 넘어가지 않음.
            for (int j = 0; j < i; j++) {
                a = (a * r) % M;
            }

            //M으로 나눈 나머지로 더해야 long 범위를 넘어가지 않음.
            sum += (temp * a) % M;
            sum %= M;
        }
        System.out.println(sum % M);
    }
}