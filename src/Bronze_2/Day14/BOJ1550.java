package Bronze_2.Day14;

import java.util.Scanner;

public class BOJ1550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.nextLine().toCharArray();

        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp;
            if (arr[i] >= 'A') temp = arr[i] - 'A' + 10;
            else temp = arr[i] - '0';

            int m = (int) Math.pow(16, arr.length - i - 1);
            sum += temp * m;

        }
        System.out.println(sum);
    }
}
