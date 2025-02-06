package Bronze.Bronze_2.Day20;

import java.util.Scanner;

public class BOJ3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
            sum += temp;
        }
        sum = sum - 100; // 빼야하는 두 개의 합

        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }

        for (int i : arr) {
            if (i != num1 && i != num2) System.out.println(i);
        }

    }
}
