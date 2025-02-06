package Bronze.Bronze_4.Day11;

import java.util.Scanner;

public class BOJ1264_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowel = "aeiouAEIOU";
        int count;

        while (true) {
            count = 0;
            String sentence = sc.nextLine();

            if (sentence.equals("#")) {
                break;
            }

            for (char c : sentence.toCharArray()) {
                //indexOf(A) 메서드: A가 처음 발견되는 인덱스 반환, 없으면 -1 반환
                 if (vowel.indexOf(c) > -1) {
                     count++;
                 }
            }
            System.out.println(count);
        }
    }
}
