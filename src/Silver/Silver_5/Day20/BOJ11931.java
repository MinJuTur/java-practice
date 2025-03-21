package Silver.Silver_5.Day20;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            bw.append(arr.get(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
