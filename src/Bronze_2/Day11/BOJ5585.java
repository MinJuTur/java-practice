package Bronze_2.Day11;

import java.util.Scanner;

public class BOJ5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rest = 1000 - sc.nextInt(); //물건 가격
        int count = 0; //잔돈 개수
        int[] coins = {500, 100, 50, 10, 5, 1}; //거스름돈 종류

        for (int coin : coins) {
            if (rest >= coin) {
                count += rest / coin;
                rest = rest % coin;
            }
        }

        System.out.println(count);
    }
}
