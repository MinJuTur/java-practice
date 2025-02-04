package Bronze_1.Day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2846_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        boolean isUp = false;
        int firstNum = 0;
        int count = 0;
        int now = 0;
        int next = 0;
        int max = 0;
        for (int i = 0; i < N - 1; i++) {
            if (i == 0) {
                now = Integer.parseInt(st.nextToken());
                next = Integer.parseInt(st.nextToken());
            } else {
                now = next;
                next = Integer.parseInt(st.nextToken());
            }

            if (now < next) {
                isUp = true;
                count++;
            } else {
                isUp = false;
                if (count != 0) {
                    int height = now - firstNum;
                    if (height > max) max = height;
                    count = 0;
                }
            }

            if (count == 1) firstNum = now;
        }
        if (isUp) {
            int height = next - firstNum;
            if (height > max) max = height;
        }
        System.out.println(max);
    }
}
