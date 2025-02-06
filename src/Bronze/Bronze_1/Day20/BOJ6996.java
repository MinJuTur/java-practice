package Bronze.Bronze_1.Day20;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ6996 {

    private static boolean solveAnagrams(String first, String second ) {
        if (first.length() != second.length()) return false;

        char[] s1Arr = first.toCharArray();
        char[] s2Arr = second.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        for (int i = 0; i < s1Arr.length; i++) {
            if (s1Arr[i] != s2Arr[i]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
