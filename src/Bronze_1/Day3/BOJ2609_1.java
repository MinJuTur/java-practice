package Bronze_1.Day3;

import java.util.Scanner;

public class BOJ2609_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = 0; //최대 공약수
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) max = i;
        }
        int min = max * (num1/max) * (num2/max); //최소 공배수

        System.out.println(max);
        System.out.println(min);
    }
}