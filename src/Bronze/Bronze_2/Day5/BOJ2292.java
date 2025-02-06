package Bronze.Bronze_2.Day5;

import java.util.Scanner;

public class BOJ2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int layer = 1;
        int currentRoom = 1;
        while (true) {
            if (N > currentRoom) {
                currentRoom += 6 * layer;
                layer++;
            } else {
                System.out.println(layer);
                break;
            }
        }

    }
}
