package Silver.Silver_5.Day8;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11723_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(bf.readLine());

        int[] arr = new int[21];
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String calculation = st.nextToken();
            int x = 0;

            switch (calculation) {
                case "all":
                    Arrays.fill(arr, 1);
                    break;
                case "empty":
                    Arrays.fill(arr, 0);
                    break;
                case "add":
                    x = Integer.parseInt(st.nextToken());
                    arr[x] = 1;
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    arr[x] = 0;
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    bw.write(arr[x] + "\n");
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    if (arr[x] == 1) arr[x] = 0;
                    else arr[x] = 1;
                    break;
                default:
                    break;
            }
        }
        bw.flush();
    }
}
