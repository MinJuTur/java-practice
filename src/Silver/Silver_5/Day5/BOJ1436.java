package Silver.Silver_5.Day5;

import java.util.Scanner;

public class BOJ1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;
        int i = 0;

        while (count != N) {
            i++;
            if (String.valueOf(i).contains("666")) count++;
        }
        System.out.println(i);
    }
}
