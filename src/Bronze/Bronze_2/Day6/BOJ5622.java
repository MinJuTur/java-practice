package Bronze.Bronze_2.Day6;

import java.util.Scanner;

public class BOJ5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] word = sc.next().toCharArray();
        int time = 0;

        for (int i = 0; i < word.length; i++) {
            char temp = word[i];
            if (temp <= 'C') time += 3;
            else if (temp <= 'F') time += 4;
            else if (temp <= 'I') time += 5;
            else if (temp <= 'L') time += 6;
            else if (temp <= 'O') time += 7;
            else if (temp <= 'S') time += 8;
            else if (temp <= 'V') time += 9;
            else if (temp <= 'Z') time += 10;

        }
        System.out.println(time);
    }
}
