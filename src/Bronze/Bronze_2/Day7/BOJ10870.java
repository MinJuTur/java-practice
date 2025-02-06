package Bronze.Bronze_2.Day7;

import java.util.Scanner;

public class BOJ10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp1 = 0;
        int temp2 = 1;
        int temp3 = 0;
        if (n == 0) {
            temp3 = temp1;
        } else if (n == 1) {
            temp3 = temp2;
        } else {
            for (int i = 1; i < n; i++) {
                temp3 = temp1 + temp2;
                temp1 = temp2;
                temp2 = temp3;
            }
        }
        System.out.println(temp3);
    }
}
