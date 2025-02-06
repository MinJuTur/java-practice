package Bronze.Bronze_4.Day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11945_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bf.readLine();
        StringTokenizer st = new StringTokenizer(s1);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String shape = bf.readLine();
            for (int j = m - 1; j >= 0 ; j--) {
                System.out.print(shape.charAt(j));
            }
            System.out.println();
        }
    }
}
