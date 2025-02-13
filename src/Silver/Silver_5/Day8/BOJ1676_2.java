package Silver.Silver_5.Day8;

import java.util.Scanner;

public class BOJ1676_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //2의 개수와 5의 개수를 세어 10이 몇 번 곱해지는지 알아낸다.
        //항상 5의 개수가 2의 개수보다 작기 때문에, 5의 개수가 10의 개수가 되어진다.
        int count_5 = 0;
        for (int i = 5; i <= N; i++) {
            int temp = N;
            while (temp % 5 == 0) {
                count_5++;
                temp /= 5;
            }
        }
        System.out.println(count_5);
    }
}
