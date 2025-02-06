package Bronze.Bronze_4.Day9;

import java.util.Scanner;

public class BOJ10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String message = "";
        if (a + b + c != 180) {
            message = "Error";
        } else if (a == b & b == c) {
            message = "Equilateral";
        } else if (a == b | b == c | c == a) {
            message = "Isosceles";
        } else {
            message = "Scalene";
        }
        System.out.println(message);
    }
}