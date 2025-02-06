package Bronze.Bronze_1.Day10;

import java.util.Scanner;

public class BOJ11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.nextLine().toCharArray();
        for (int i = 0; i < S.length; i++) {
            char temp = S[i];
            if (temp >= 65) { //알파벳일 때
                if ((temp > 109 && temp <= 122) || (temp > 77 && temp <= 90)) { //+13을 하면 넘어가는 알파벳일 때
                    temp -= 13;
                } else temp += 13;
            }
            System.out.print(temp);
        }
    }
}