package OPP_practice.OOP_3rd;

import java.util.Scanner;

public class GetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0;

        while (n != -1) {
            sum += n;
            System.out.print("정수를 입력하시오: ");
            n = sc.nextInt();
        }
        System.out.println("정수의 합은 " + sum + "입니다.");
    }
}
