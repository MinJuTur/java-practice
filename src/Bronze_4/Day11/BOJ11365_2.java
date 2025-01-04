package Bronze_4.Day11;

import java.util.Scanner;

public class BOJ11365_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String code = sc.nextLine();

            if (code.equals("END")) {
                break;
            }

            char[] codeList = code.toCharArray();
            for (int i = codeList.length - 1; i >= 0; i++) {
                System.out.print(codeList[i]);
            }
            System.out.println();
        }
    }
}
