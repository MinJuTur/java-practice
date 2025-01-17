package Bronze_1.Day4;

import java.util.Scanner;

public class BOJ1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); //month
        int y = sc.nextInt(); //day

        int totalDays = y;
        for (int i = 1; i < x; i++) {
            if (i == 2) totalDays += 28;
            else if (i == 4 || i == 6 || i == 9 || i == 11) totalDays += 30;
            else totalDays += 31;
        }

        int rest = totalDays % 7;
        switch (rest) {
            case 0:
                System.out.println("SUN");
                break;
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            default:
                break;
        }
    }
}
