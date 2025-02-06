package Algorithm.JAVA.Chapter1_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] S = new int[N+1];
        st = new StringTokenizer(bf.readLine());
        S[0] = 0;
        for (int i = 1; i <= N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            S[i] = S[i-1] + temp;
        }

        for (int l = 0; l < M; l++) {
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}
