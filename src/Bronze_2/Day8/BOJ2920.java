package Bronze_2.Day8;

import java.util.Scanner;

public class BOJ2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isMixed = false;
        boolean isAscending;

        int temp1 = sc.nextInt();
        int temp2 = sc.nextInt();
        if (temp1 < temp2) isAscending = true;
        else isAscending = false;

        for (int i = 0; i < 6; i++) {
            temp1 = temp2;
            temp2 = sc.nextInt();

            if (isAscending && temp1 > temp2 || !isAscending && temp1 < temp2) {
                isMixed = true;
                break;
            }
        }

        if (isMixed) System.out.println("mixed");
        else if (isAscending) {
            System.out.println("ascending");
        } else System.out.println("descending");
    }
}
