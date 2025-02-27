package Silver.Silver_5.Day14;

import java.util.Scanner;

public class BOJ13241_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        long minCom = Math.min(A,B); //최대공약수
        while (true) {
            if (A % minCom == 0 && B % minCom == 0) break;
            minCom--;
        }

        System.out.println(minCom*(A/minCom)*(B/minCom));
    }
}
