package Bronze_2.Day19;

import java.util.Scanner;

public class BOJ7567 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();
        int height = 10; //arr[0]의 높이

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) height += 5;
            else height += 10;
        }
        System.out.println(height);
    }
}
