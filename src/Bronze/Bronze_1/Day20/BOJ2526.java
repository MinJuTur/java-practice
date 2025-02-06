package Bronze.Bronze_1.Day20;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ2526 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int P = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();

        int temp = N;
        while (true) {
            temp = (temp * N) % P;
            for (int i = 0; i < A.size(); i++) {
                if (A.get(i) == temp) {
                    System.out.println(A.size() - i);
                    return;
                }
            }
            A.add(temp);
        }
    }
}
