package Bronze_5.Day14;

import java.util.Scanner;

public class BOJ10807_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //입력받은 수를 그대로 저장하는 배열
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int count = 0;
        for (int num : nums) {
            if (num == v) {
                count++;
            }
        }
        System.out.println(count);
    }
}
