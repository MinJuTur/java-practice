package Bronze.Bronze_1.Day19;

import java.util.Scanner;

public class BOJ14659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int maxCnt = 0;
        int count = 0;
        int start = sc.nextInt();
        for (int i = 0; i < N-1; i++) {
            int enemy = sc.nextInt();
            if (start > enemy){
                count++;
            } else if (start < enemy) {
                start = enemy;
                count = 0;
            }
            if (count > maxCnt) maxCnt = count;
        }
        System.out.println(maxCnt);
    }
}
