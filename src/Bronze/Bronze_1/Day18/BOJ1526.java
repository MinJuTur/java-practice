package Bronze.Bronze_1.Day18;

import java.util.Scanner;

public class BOJ1526 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = N; i >= 4 ; i--) {
            char[] temp = String.valueOf(i).toCharArray();

            boolean isOK = true;
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] != '4' && temp[j] != '7') {
                    isOK = false;
                    break;
                }

            }
            if (isOK) {
                System.out.println(i);
                break;
            }
        }
    }
}
