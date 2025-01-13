package Bronze_2.Day16;

import java.util.Scanner;

public class BOJ1977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        int min = 1;
        boolean isHave = false;
        for (int i = 10000; i > 0; i--) {
            int temp = i*i;
            if (temp <= N && temp >= M) {
                isHave = true;
                sum += temp;
                min = temp;
            }
        }

        if (isHave) {
            System.out.println(sum);
            System.out.println(min);
        } else System.out.println(-1);
    }
}
