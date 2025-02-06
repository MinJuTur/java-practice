package Bronze.Bronze_2.Day9;

import java.util.Scanner;

public class BOJ2581_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = 0;

        if (M == 1) M++;
        for (int i = N; i >= M; i--) { //i: N부터 M까지 -1만큼씩 줄어든다.
            boolean isSosu = true;
            for (int j = 2; j <= Math.sqrt(i); j++) { //i가 소수인지 판별한다.
                if (i % j == 0) {
                    isSosu = false;
                    break;
                }
            }

            if (isSosu){
                sum += i;
                min = i;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}