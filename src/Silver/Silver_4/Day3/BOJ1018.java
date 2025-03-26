package Silver.Silver_4.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            char[] temp = bf.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                arr[i][j] = temp[j];
            }
        }

        int minCnt = Integer.MAX_VALUE;
        for (int i = 0; i < N && i+8 <= N; i++) {
            for (int j = 0; j < M && j+8 <= M; j++) {
                int count = 0;
                char start = arr[i][j]; //i+j가 짝수일 때 되어야만 하는 색깔
                for (int k = i; k < i+8 ; k++) {
                    for (int l = j; l < j+8; l++) {
                        if ((k+l)%2 == 0 && arr[k][l] != start) count++;
                        else if ((k+l)%2 != 0 && arr[k][l] == start) count++;
                    }
                }
                count = Math.min(count, Math.abs(64-count));
                if (count < minCnt) minCnt = count;
            }
        }

        System.out.println(minCnt);
    }
}
