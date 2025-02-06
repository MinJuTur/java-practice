package Bronze.Bronze_1.Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if (L == 0) break;

            int temp = (V / P) * L;
            if (V%P >= L) temp += L;
            else temp += V%P;
            System.out.println("Case " + count + ": " + temp);
            count++;
        }
    }
}
