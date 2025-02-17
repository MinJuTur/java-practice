package Silver.Silver_5.Day10;

import java.util.Scanner;

public class BOJ1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        if (E == 15) E = 0;
        if (S == 28) S = 0;
        if (M == 19) M = 0;

        long year = 0;
        while (true) {
            year++;
            if (year % 15 == E && year % 28 == S && year % 19 == M) break;
        }
        System.out.println(year);
    }
}
