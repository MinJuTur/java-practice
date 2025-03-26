package Silver.Silver_4.Day3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BOJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20000001];
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            arr[temp+10000000]++;
        }

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int temp = sc.nextInt();
            bw.append(arr[temp+10000000] + " ");
        }

        bw.flush();
        bw.close();
    }
}
