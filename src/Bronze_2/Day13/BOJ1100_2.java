package Bronze_2.Day13;

import java.util.Scanner;

public class BOJ1100_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < 8; i++) {
            char[] A = sc.nextLine().toCharArray();

            for (int j = 0; j < 8; j++) {
                //인덱스 번호의 합이 짝수 -> 흰색 칸
                if (A[j] == 'F' && (i + j) % 2 == 0) count++;
            }
        }

        System.out.println(count);
    }
}
