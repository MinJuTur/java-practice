package Silver.Silver_5.Day16;

import java.util.Scanner;

public class BOJ14916 {
    //그리디+idea(5원으로 거슬러 주고 남은 돈이 홀수일 때
    // 5원 개수-1 을 하면 거슬러 주고 남은 돈이 짝수가 되므로 2원으로 거슬러 줄 수 있음)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1 || n == 3) {
            System.out.println(-1);
            return;
        }

        int Cnt5 = n/5;
        int rest = n % 5;

        if (rest % 2 != 0) {
            Cnt5--;
            rest += 5;
        }

        int Cnt2 = rest/2;
        System.out.println(Cnt5+Cnt2);
    }
}
