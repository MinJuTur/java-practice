package Bronze.Bronze_2.Day20;

import java.util.Scanner;

public class BOJ1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String answer = "";
        int[] count = new int[26]; //알파벳 등장 횟수를 저장하는 배열
        for (int i = 0; i < N; i++) {
            char temp = sc.next().charAt(0); //성의 첫 글자
            count[temp - 'a']++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 5) answer += String.valueOf((char)('a' + i));
        }

        if (answer.equals("")) System.out.println("PREDAJA");
        else System.out.println(answer);
    }
}
