package Silver.Silver_5.Day4;

import java.util.Scanner;

public class BOJ1427_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String temp = sc.next();

        int[] A = new int[10]; // 0부터 9까지 저장하는 배열

        for (int i = 0; i < temp.length(); i++) {
            A[Integer.parseInt(String.valueOf(temp.charAt(i)))]++;
        }

        for (int i = A.length - 1; i >= 0 ; i--) {
            for (int j = 0; j < A[i]; j++) {
                System.out.print(i);
            }
        }
    }
}
