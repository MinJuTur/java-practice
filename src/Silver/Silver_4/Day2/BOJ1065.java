package Silver.Silver_4.Day2;

import java.util.Scanner;

public class BOJ1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;


        if (N < 100) count = N;
        else {
            count += 99;
            for (int i = 111; i <= N; i++) {
                int n1 = i/100;
                int n2 = (i/10) % 10;
                int n3 = i % 10;

                if (n2 - n1 == n3 - n2) count++;
            }
        }

        System.out.println(count);
    }
}
