package Silver.Silver_5.Day10;

import java.util.Scanner;

public class BOJ1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long S = sc.nextLong();

        long sum = 0;
        long i = 0;
        while (sum <= S) {
            i++;
            sum += i;
        }
        System.out.println(i-1);
    }
}
