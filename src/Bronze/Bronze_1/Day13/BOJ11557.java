package Bronze.Bronze_1.Day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11557 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(bf.readLine());
            String[] S = new String[N];
            int[] L = new int[N];
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(bf.readLine());
                S[j] = st.nextToken();
                L[j] = Integer.parseInt(st.nextToken());
                if (L[j] > max){
                    max = L[j];
                    maxIndex = j;
                }

            }
            System.out.println(S[maxIndex]);
        }
    }
}
