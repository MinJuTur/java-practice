package Silver.Silver_5.Day11;

import java.util.Scanner;

public class BOJ1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int count = 0;

        //X를 2진수로 표현해서 1이 되었을 때 count 한다
        while (X > 0) {
            if (X % 2 == 1) {
                count++;
            }
            X /= 2;
        }
        System.out.println(count);
    }
}
