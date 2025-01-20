package Bronze_1.Day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            char[] S = bf.readLine().toCharArray();
            if (S.length == 1 && S[0] == '0') break;

            int i = 0;
            int j = S.length - 1;
            boolean isRight = true;
            while (i < j) {
                if (S[i] != S[j]) {
                    isRight = false;
                    break;
                }
                i++;
                j--;
            }

            if (isRight) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
