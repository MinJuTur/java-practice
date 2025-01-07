package Bronze_2.Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2750_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(bf.readLine());
        }

        //Arrays.sort(nums);
        //버블 정렬
        for (int i = 1; i < N; i++) { //N=5, i=1,2,3,4
            for (int j = 0; j < N - i; j++) { //j=0,1,2,3  j=0,1,2  j=0,1  j=0 (총 (N-1)번 회전)
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
