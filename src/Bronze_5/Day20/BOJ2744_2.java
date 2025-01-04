package Bronze_5.Day20;

import java.util.Scanner;

public class BOJ2744_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] textArray = sc.nextLine().toCharArray();

        //대문자에 32를 더하면 소문자가 된다.(아스키코드)
        for (char c : textArray) {
            if (c >= 'a' & c <= 'z') {
                System.out.print((char) (c - 32));
            } else {
                System.out.print((char) (c + 32));
            }
        }
    }
}