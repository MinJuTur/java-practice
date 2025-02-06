package Bronze.Bronze_1.Day13;

import java.util.Scanner;

public class BOJ2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            temp = sc.nextInt();
            sum += temp;
            if (sum >= 100) break;
        }
        if (sum - 100 == 100 - (sum - temp)) System.out.println(sum);
        else if (sum - 100 > 100 - (sum - temp)) System.out.println(sum - temp);
        else if (sum - 100 < 100 - (sum - temp)) System.out.println(sum);
    }
}
