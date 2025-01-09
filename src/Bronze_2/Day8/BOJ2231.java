package Bronze_2.Day8;

import java.util.Scanner;

public class BOJ2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = Long.parseLong(sc.next());
        long constructor = 0;

        for (long i = 0; i < N; i++) {
            long temp = i;
            long sum = temp;
            char[] temp_str = String.valueOf(temp).toCharArray();
            for (char c : temp_str) {
                sum += Long.parseLong(String.valueOf(c));
            }
            if (sum == N) {
                constructor = temp;
                break;
            }
        }
        System.out.println(constructor);
    }
}
