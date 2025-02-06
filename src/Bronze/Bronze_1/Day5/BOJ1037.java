package Bronze.Bronze_1.Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        int min = Collections.min(A);
        int max = Collections.max(A);
        System.out.println(min*max);
    }
}