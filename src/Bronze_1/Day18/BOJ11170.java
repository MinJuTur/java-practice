package Bronze_1.Day18;

import java.util.Scanner;

public class BOJ11170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int count = 0;
            for (int j = N; j <= M ; j++) {
                char[] temp = String.valueOf(j).toCharArray();
                for (int k = 0; k < temp.length; k++) {
                    if (temp[k] == '0') count++;
                }
            }
            System.out.println(count);
        }
    }
}
