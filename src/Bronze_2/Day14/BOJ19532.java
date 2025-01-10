package Bronze_2.Day14;

import java.util.Scanner;

public class BOJ19532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (a*i + b*j == c && d*i + e*j == f){
                    System.out.println(i + " " + j);
                    break;
                }
            }

        }
    }
}
