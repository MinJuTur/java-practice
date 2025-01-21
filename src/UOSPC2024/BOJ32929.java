package UOSPC2024;

import java.util.Scanner;

public class BOJ32929 {
    public static void main(String[] args) {
        String UOS = "UOSUOS"; //x번째: 1, 2, 3  나머지: 1, 2, 0
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int index = x % 3 + 2; //인덱스: 0, 1, 2
        System.out.println(UOS.charAt(index));
    }
}
