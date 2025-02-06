package Bronze.Bronze_2.Day17;

import java.util.Scanner;

public class BOJ2902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.next().split("-");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i].charAt(0));
        }
    }
}
