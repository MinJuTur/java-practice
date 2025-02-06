package Bronze.Bronze_1.Day1;

import java.util.Scanner;

public class BOJ1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int temp = N / 10 + N % 10; //각 자리 숫자 더하기
        int new_value = (N % 10) * 10 + temp % 10;
        int count = 1;

        while (N != new_value) {
            temp = new_value / 10 + new_value % 10; //각 자리 숫자 더하기
            new_value = (new_value % 10) * 10 + temp % 10;
            count++;
        }
        System.out.println(count);
    }
}