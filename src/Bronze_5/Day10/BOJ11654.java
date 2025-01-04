package Bronze_5.Day10;

import java.util.Scanner;

public class BOJ11654 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 글자 -> 아스키코드 변환: char를 int로 형변환
        // cf) 아스키코드 -> 글자 변환: int를 char로 형변환
        String text = sc.next();
        char textCtr = text.charAt(0);
        System.out.println((int) textCtr);
    }
}
