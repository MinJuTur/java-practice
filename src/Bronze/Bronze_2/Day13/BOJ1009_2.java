package Bronze.Bronze_2.Day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1009_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine()); //테스트 케이스 개수
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken()); //밑
            int b = Integer.parseInt(st.nextToken()); //지수

            int temp = a % 10;
            for (int j = 0; j < b-1; j++) {
                temp = (temp * a) % 10;
            }

            if (temp == 0) System.out.println(10);
            else System.out.println(temp);
        }
    }
}
