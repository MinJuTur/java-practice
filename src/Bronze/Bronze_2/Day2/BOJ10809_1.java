package Bronze.Bronze_2.Day2;

import java.util.Scanner;

public class BOJ10809_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 알파벳이 존재하는지, 처음 어디서 등장하는지 확인해야 함
        char[] S = sc.next().toCharArray();
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        int[] counts = new int[26];
        for (int i = 0; i < 26; i++) {
            counts[i] = -1;
        }

        for (int i = 0; i < S.length; i++) {
            char alphabet = S[i];
            for (int j = 0; j < alphabets.length; j++) {
                if (counts[j] == -1 && alphabet == alphabets[j]) {
                    counts[j] = i;
                }
            }
        }

        for (int count : counts) {
            System.out.print(count + " ");
        }
    }
}