package Bronze_1.Day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int[] A = new int[10];
            for (int j = 0; j < 10; j++) {
                A[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(A);
            System.out.println(A[7]);
        }

    }
}
