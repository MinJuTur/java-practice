package Bronze.Bronze_1.Day16;

import java.util.Scanner;

public class BOJ2810_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] A = sc.next().toCharArray();

        int count = 1;
        for (int i = 0; i < N;) {
            char temp = A[i];

            if (temp == 'S') {
                i++;
            } else if (temp == 'L') {
                i += 2;
            }

            count++;
        }
        System.out.println(Math.min(count, N));
    }
}
