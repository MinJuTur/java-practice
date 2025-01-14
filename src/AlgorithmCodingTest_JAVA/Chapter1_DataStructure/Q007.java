package AlgorithmCodingTest_JAVA.Chapter1_DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp < M) arr.add(temp);
        }
        Collections.sort(arr);

        int start_index = 0;
        int end_index = arr.size() - 1;
        int sum = arr.get(start_index) + arr.get(end_index);
        int count = 0;

        while (start_index < end_index) {
            if (sum < M) {
                start_index++;
            } else if (sum > M) {
                start_index++;
                end_index = start_index + 1;
            } else if (sum == M) {
                count++;
                start_index++;
                end_index = start_index + 1;
            }
            sum = arr.get(start_index) + arr.get(end_index);
        }

    }
}
