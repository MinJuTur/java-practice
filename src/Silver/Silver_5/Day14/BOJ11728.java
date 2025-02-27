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

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (pointerA < N && pointerB < M) {
            if (A[pointerA] < B[pointerB]) {
                bw.write(A[pointerA] + " ");
                pointerA++;
            } else if (A[pointerA] > B[pointerB]) {
                bw.write(B[pointerB] + " ");
                pointerB++;
            }
        }

        if (pointerA == N) {
            for (int i = pointerB; i < M; i++) {
                bw.write(B[pointerB] + " ");
            }
        } else if (pointerB == M) {
            for (int i = pointerA; i < N; i++) {
                bw.write(A[pointerA] + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
