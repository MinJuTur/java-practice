package Bronze_2.Day19;

import java.util.Scanner;

public class BOJ10820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            char[] S = sc.nextLine().toCharArray(); //한 문장을 받아 공백까지 char로 저장
            int small = 0; //소문자 개수
            int big = 0; //대문자 개수
            int num = 0; //숫자 개수
            int space = 0;//공백 개수

            for (char c : S) {
                if (c >= 'a') small++; //(int) 'a' = 97
                else if (c >= 'A') big++; //(int) 'A' = 65;
                else if (c >= '0') num++; //(int) '0' = 48
                else space++;
            }
            System.out.println(small + " " + big + " " + num + " " + space);
        }
    }
}
