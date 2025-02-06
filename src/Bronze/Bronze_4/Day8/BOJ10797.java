package Bronze.Bronze_4.Day8;

import java.util.Scanner;

public class BOJ10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dateNum = sc.nextInt();

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (sc.nextInt() == dateNum) {
                count++;
            }
        }

        System.out.println(count);
    }
}