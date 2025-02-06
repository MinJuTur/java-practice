package Bronze.Bronze_5.Day20;

import java.util.Scanner;

public class BOJ2744_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String answer = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            //Character 클래스: isUpperCase(), toLowerCase() 메서드
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else {
                c = Character.toUpperCase(c);
            }
            answer += c;
        }

        System.out.println(answer);
    }
}