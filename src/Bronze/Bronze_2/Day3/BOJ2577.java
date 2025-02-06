package Bronze.Bronze_2.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        int C = Integer.parseInt(bf.readLine());
        char[] result = String.valueOf(A * B * C).toCharArray();

        for (int i = 0; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < result.length; j++) {
                if (Integer.parseInt(String.valueOf(result[j])) == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
