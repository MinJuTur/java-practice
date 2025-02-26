package Silver.Silver_5.Day13;

import java.util.Scanner;

public class BOJ1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //0덩어리, 1덩어리 개수 세기 -> 덩어리 수가 최소인 것 찾기
        int count_0 = 0;
        int count_1 = 0;
        char[] S = sc.next().toCharArray();

        for (int i = 1; i < S.length; i++) {
            if (S[i] != S[i-1]) { //덩어리가 끝났을 때
                if (S[i-1] == '0') count_0++;
                else count_1++;
            }
            if (i == S.length - 1) { //마지막 덩어리
                if (S[i] == '0') count_0++;
                else count_1++;
            }
        }

        System.out.println(Math.min(count_0, count_1));
    }
}
