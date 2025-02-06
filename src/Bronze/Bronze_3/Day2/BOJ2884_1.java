package Bronze.Bronze_3.Day2;

import java.util.Scanner;

public class BOJ2884_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        //M-45 가 H를 바꾸는지 확인
        if (M - 45 < 0) {
            if (H == 0) {
                H = 23;
            } else {
                H--;
            }
            M += 15;
        } else {
            M -= 45;
        }

        System.out.println(H + " " + M);
    }
}
