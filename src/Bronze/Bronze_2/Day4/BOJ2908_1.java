package Bronze.Bronze_2.Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        char[] num1 = st.nextToken().toCharArray();
        char[] num2 = st.nextToken().toCharArray();

        String reversed_num1_str = "";
        String reversed_num2_str = "";

        for (int i = 2; i >= 0 ; i--) {
            reversed_num1_str += num1[i];
            reversed_num2_str += num2[i];
        }

        int reversed_num1_int = Integer.parseInt(reversed_num1_str);
        int reversed_num2_int = Integer.parseInt(reversed_num2_str);

        if (reversed_num1_int>reversed_num2_int) System.out.println(reversed_num1_int);
        else System.out.println(reversed_num2_int);
    }
}