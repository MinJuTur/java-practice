package Bronze.Bronze_2.Day12;

import java.util.Scanner;

public class BOJ13458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long count = 0;

        int N = sc.nextInt(); //시험장의 개수
        int[] A = new int[N]; //각 시험장의 응시자 수
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt(); //총감독관 감시 가능 응시자 수
        int C = sc.nextInt(); //부감독관 감시 가능 응시자 수

        for (int i : A) {
            int temp = i - B;
            count++; //총감독관 카운트

            if (temp > 0) {
                count += temp / C;
                if (temp % C != 0) count++;
            }
        }

        System.out.println(count);
    }
}
