package Bronze_3.Day2;

import java.util.Scanner;

public class BOJ10818_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < N; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
