package Bronze_2.Day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long A = Long.parseLong(st.nextToken()); //고정비용
        long B = Long.parseLong(st.nextToken()); //한 대 당 가변 비용
        long C = Long.parseLong(st.nextToken()); //판매 가격

        int i = 1;
        if (B >= C) {
            System.out.println(-1);
        } else {
            while (A + B * i >= C * i) { //차익<= 0일 때 반복
                i++;
            }
            System.out.println(i);
        }
    }
}
