package Silver.Silver_5.Day8;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11723_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(bf.readLine());

        int[] arr = new int[21];
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String calculation = st.nextToken();
            int x = 0;
            if (!calculation.equals("all") && !calculation.equals("empty")) {
                x = Integer.parseInt(st.nextToken());
            }
            switch (calculation) {
                case "all":
                    for (int j = 1; j < arr.length; j++) {
                        arr[j] = 1;
                    }
                    break;
                case "empty":
                    for (int j = 1; j < arr.length; j++) {
                        arr[j] = 0;
                    }
                    break;
                case "add":
                    arr[x] = 1;
                    break;
                case "remove":
                    arr[x] = 0;
                    break;
                case "check":
                    bw.write(arr[x] + "\n");
                    break;
                case "toggle":
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
