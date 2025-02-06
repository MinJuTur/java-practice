package Bronze.Bronze_2.Day1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input);

        System.out.println(st.countTokens());
    }
}

