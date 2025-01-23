package Bronze_1.Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ24416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        A.add(2); //fib(3), index 0
        A.add(3); //fib(4), index 1
        for (int i = 2; i <= n - 3; i++) {
            int temp = A.get(i - 2) + A.get(i - 1);
            A.add(temp);
        }
        System.out.println(A.get(n - 3) + " " + (n - 2));
    }
}