package Bronze.Bronze_5.Day17;

import java.util.Scanner;

public class BOJ9086_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            //next()를 사용하면 개행문자를 입력받지 않음
            String word = sc.next();
            //charAt() 메서드: 원하는 인덱스의 char를 가져옴
            System.out.print(word.charAt(0));
            System.out.println(word.charAt(word.length()-1));
        }
    }
}
