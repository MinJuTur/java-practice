package AlgorithmCodingTest_JAVA.Chapter1_DataStructure;

import java.util.Scanner;

public class Q001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        String input = sc.next();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(String.valueOf(input.charAt(i)));
        }

        System.out.println(sum);
    }
}
