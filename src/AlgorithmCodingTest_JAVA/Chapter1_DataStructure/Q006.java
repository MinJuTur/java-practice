package AlgorithmCodingTest_JAVA.Chapter1_DataStructure;

import java.util.Scanner;

public class Q006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long start_index = 1;
        long end_index = 1;
        long sum = 1;
        long count = 1;

        while (end_index != N) {
            if (sum == N) {
                count++;
                end_index++;
                sum += end_index;
            } else if (sum > N) {
                sum -= start_index;
                start_index++;
            } else if (sum < N) {
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }
}
