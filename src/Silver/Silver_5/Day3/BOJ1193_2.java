package Silver.Silver_5.Day3;

import java.util.Scanner;

public class BOJ1193_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int x = 1;
        int y = 1;
        int count = 1;
        boolean isUp = true; //방향을 나타낸다.

        while (count != X) {
            if (x == 1 && isUp){ //방향을 바꾼다.
                isUp = false;
                y++;
            } else if (y == 1 && !isUp){ //방향을 바꾼다.
                isUp = true;
                x++;
            } else if (isUp) {
                x--;
                y++;
            } else if (!isUp) {
                x++;
                y--;
            }

            count++;
        }

        System.out.println(x + "/" + y);
    }
}
