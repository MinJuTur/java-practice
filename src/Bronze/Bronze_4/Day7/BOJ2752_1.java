package Bronze.Bronze_4.Day7;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2752_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        Arrays.sort(nums);

        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
    }
}
