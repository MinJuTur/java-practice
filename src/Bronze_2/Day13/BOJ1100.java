package Bronze_2.Day13;

import java.util.Scanner;

public class BOJ1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < 8; i++) {
            char[] A = sc.nextLine().toCharArray();
            sc.nextLine();

            int startIndex = 1;
            if (i % 2 == 0) startIndex = 0;
            else startIndex = 1;

            for (int j = startIndex; j < 8; j+= j) {
                if (A[j] == 'F') count++;
            }
        }

        System.out.println(count);
    }
}
