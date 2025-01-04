package Bronze_5.Day16;

import java.util.Scanner;

public class BOJ5597 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 배열의 인덱스 사용
        인덱스 번호가 불리면 1로 바꿈
        기본 설정은 0이므로 최종적으로 0인 자리는 불리지 않은 것임
         */
        int[] A = new int[31];
        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            A[num] = 1;
        }
        for (int i = 1; i < 31; i++) {
            if (A[i] == 0) {
                System.out.println(A[i]);
            }
        }
    }
}
