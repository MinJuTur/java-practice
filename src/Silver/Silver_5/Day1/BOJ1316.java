package Silver.Silver_5.Day1;

import java.util.Scanner;

public class BOJ1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            boolean isGroupWord = true;
            char[] S = sc.next().toCharArray();
            int[] alphabet = new int[26];
            for (int j = 0; j < S.length; j++) {
                int temp = S[j] - 'a';
                if (alphabet[temp] == 0) alphabet[temp]++;
                else if (S[j-1] != S[j]){
                    isGroupWord = false;
                    break;
                }
            }
            if (isGroupWord) count++;
        }
        System.out.println(count);
    }
}
