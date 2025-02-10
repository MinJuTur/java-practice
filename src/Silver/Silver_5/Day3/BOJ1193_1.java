package Silver.Silver_5.Day3;

import java.util.Scanner;

public class BOJ1193_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < 2500000; i++) {
            sum += i;
            if (X <= sum) {
                int n = X - (sum - i) - 1;
                if (i % 2 != 0) {
                    System.out.print(i - n);
                    System.out.print("/");
                    System.out.print(1 + n);
                } else {
                    System.out.print(1 + n);
                    System.out.print("/");
                    System.out.print(i - n);
                }
                break;
            }
        }
    }
}
