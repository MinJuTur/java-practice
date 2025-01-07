package Bronze_2.Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        char[] num1 = st.nextToken().toCharArray();
        char[] num2 = st.nextToken().toCharArray();

        //순서 바꾸기
        char temp = num1[0];
        num1[0] = num1[2];
        num1[2] = temp;

        temp = num2[0];
        num2[0] = num2[2];
        num2[2] = temp;

        //char 배열 -> String ->  int 변환.
        int reversed_num1_int = Integer.parseInt(new String(num1));
        int reversed_num2_int = Integer.parseInt(new String(num2));

        //Math.max() 메서드
        System.out.println(Math.max(reversed_num1_int, reversed_num2_int));
    }
}