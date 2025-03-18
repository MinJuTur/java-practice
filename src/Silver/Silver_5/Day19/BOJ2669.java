package Silver.Silver_5.Day19;

import java.util.Scanner;

public class BOJ2669 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[101][101];

        for (int i = 0; i < 4; i++) { //네 개의 직사각형 받기
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int j = x1; j < x2 ; j++) {
                for (int k = y1; k < y2 ; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) sum++;
            }
        }

        System.out.println(sum);
    }
}
