package Silver.Silver_5.Day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int count = 1;
        int sum = 64;
        int min = 64;

        while (sum > X) { //합이 X보다 크다면, 아래와 같은 과정을 반복한다
            int half = min / 2; //가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
            min = half;

            if (sum - half >= X) { //위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이의 합이 X보다 크거나 같다면
                sum -= half; //위에서 자른 막대의 절반 중 하나를 버린다
                count = count / 2;
            }
        }
        System.out.println(count);
    }
}
