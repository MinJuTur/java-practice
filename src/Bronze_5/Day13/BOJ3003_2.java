package Bronze_5.Day13;

import java.util.Scanner;

public class BOJ3003_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int chess = sc.nextInt();
            System.out.print(numbers[i]-chess);
            System.out.println(" ");
        }
    }
}
