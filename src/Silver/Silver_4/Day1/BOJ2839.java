package Silver.Silver_4.Day1;

import java.util.Scanner;

public class BOJ2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = N/5;
        int now = N%5;

        while (cnt >= 0) {
            if (now % 3 == 0) {
                cnt += now / 3;
                System.out.println(cnt);
                return;
            }
            cnt--;
            now += 5;
        }

        System.out.println(-1);
    }
}
