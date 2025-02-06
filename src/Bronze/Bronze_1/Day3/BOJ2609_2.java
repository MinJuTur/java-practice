package Bronze.Bronze_1.Day3;

import java.util.Scanner;

public class BOJ2609_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = gcd(num1, num2); //최대 공약수
        int min = max * (num1/max) * (num2/max); //최소 공배수

        System.out.println(max);
        System.out.println(min);
    }

    //호제법: a와 b의 최대 공약수는, b와 a%b의 최대 공약수와 같다.
    private static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % b != 0) {
            return gcd(b, a % b);
        } else {
            return b;
        }
    }
}