package Bronze_2.Day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25501 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            String S = bf.readLine();

            boolean isPalindrome = true;
            int count = 0;
            for (int j = 0; j < S.length() / 2 + 1; j++) {
                count++;
                if (S.charAt(j) != S.charAt(S.length() - j - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) System.out.print(1);
            else System.out.print(0);

            System.out.println(" " + count);
        }
    }
}
