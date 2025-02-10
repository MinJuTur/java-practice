package Silver.Silver_5.Day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ11650_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] A = new int[N][2];
        for (int i = 0; i < N; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }

        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) return o1[1] - o2[1];
                else return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i][0] + " " + A[i][1]);
        }
    }
}
