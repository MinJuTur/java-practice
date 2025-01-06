package Bronze_4.Day20;

import java.util.Scanner;

public class BOJ17362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = n;

        if (n == 1) {
            System.out.println(1);
        }

        int[] row1 = {2, 3, 4, 5};
        int[] row2 = {6, 7, 8, 9};

        for (int i = 0; i < row2.length; i++) {
            num -= 8;
            if (num == row1[i]) {
                System.out.println(num);
            }
            if (num == row2[i]) {
                System.out.println(num - 2*(i+1));
            }
        }
    }
}
