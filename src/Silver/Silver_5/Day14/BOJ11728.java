package Silver.Silver_5.Day14;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int pointerA = 0;
        int pointerB = 0;

        StringBuilder sb = new StringBuilder();
        while (pointerA < N && pointerB < M) {
            if (A[pointerA] < B[pointerB]) {
                sb.append(A[pointerA] + " ");
                pointerA++;
            } else {
                sb.append(B[pointerB] + " ");
                pointerB++;
            }
        }

        if (pointerA == N) {
            for (int i = pointerB; i < M; i++) {
                sb.append(B[i] + " ");
            }
        }

        if (pointerB == M) {
            for (int i = pointerA; i < N; i++) {
                sb.append(A[i] + " ");
            }
        }

        System.out.println(sb);
    }
}
