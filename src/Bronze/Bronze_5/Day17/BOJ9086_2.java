package Bronze.Bronze_5.Day17;

import java.util.Scanner;

public class BOJ9086_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String word = sc.next();
            //substring() 메서드: 문자열 자르기
            String answer = word.substring(0, 1) + word.substring(word.length() - 1);
            System.out.println(answer);
        }
    }
}
