package Bronze.Bronze_3.Day1;

import java.util.Scanner;

public class BOJ2588_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String num2 = sc.next();

        System.out.println(num1 * Character.getNumericValue(num2.charAt(2)));
        System.out.println(num1 * Character.getNumericValue(num2.charAt(1)));
        System.out.println(num1 * Character.getNumericValue(num2.charAt(0)));
        System.out.println(num1 * Integer.parseInt(num2));
    }
}
