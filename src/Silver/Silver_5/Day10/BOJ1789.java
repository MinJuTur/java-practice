package Silver.Silver_5.Day10;

import java.util.Scanner;

public class BOJ1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long S = Long.parseLong(sc.next());

        long count = 0;
        long sum = 0;
        for (long i = 1; i < S; i++) {
            sum += i;
            count++;
            if (sum > S) {
                count--;
                break;
            } else if (sum == S) break;
        }
        System.out.println(count);
    }
}
