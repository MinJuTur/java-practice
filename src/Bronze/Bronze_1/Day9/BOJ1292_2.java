package Bronze.Bronze_1.Day9;

import java.util.Scanner;

public class BOJ1292_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] arr = new int[B + 1];
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i && index < arr.length; j++) {
                arr[index++] = i;
            }
        }

        int[] sumArr = new int[B + 1];
        for (int i = 1; i < sumArr.length; i++) {
            sumArr[i] = sumArr[i - 1] + arr[i];
        }

        System.out.println(sumArr[B] - sumArr[A-1]);
    }
}
