package Bronze_4.Day10;

import java.util.Scanner;

public class BOJ5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTime = 0;
        for (int i = 0; i < 4; i++) {
            int time = sc.nextInt();
            totalTime += time;
        }

        System.out.println(totalTime / 60);
        System.out.println(totalTime % 60);
    }
}