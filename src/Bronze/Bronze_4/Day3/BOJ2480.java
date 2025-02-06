package Bronze.Bronze_4.Day3;

import java.util.Scanner;

public class BOJ2480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int price = 0;
        if (a == b && b == c) {
            price = 10000 + a * 1000;
        } else if (a == b || b == c || c == a) {
            if (a == b) {
                price = 1000 + a * 100;
            } else {
                price = 1000 + c * 100;
            }
        } else {
            // Math 클래스의 max()메서드
            int max = Math.max(a, Math.max(b, c));
            price = max * 100;
        }

        System.out.println(price);
    }
}
