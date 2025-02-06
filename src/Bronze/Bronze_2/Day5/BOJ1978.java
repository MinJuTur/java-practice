package Bronze.Bronze_2.Day5;

import java.util.Scanner;

public class BOJ1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            boolean isSOSU = true;

            if (num == 1) {
                isSOSU = false;
            } else {
                //num의 제곱근까지만 확인해도 된다.
                for (int j = 2; j < Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isSOSU = false;
                        break;
                    }
                }
            }
            if (isSOSU) count++;
        }

        System.out.println(count);

    }
}
