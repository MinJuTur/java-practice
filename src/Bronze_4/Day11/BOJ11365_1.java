package Bronze_4.Day11;

import java.util.Scanner;

public class BOJ11365_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String code = sc.nextLine();

            // 문자열 비교는 equals() 메서드
            if (code.equals("END")) {
                break;
            }

            String[] codeList = code.split(" ");
            for (int i = codeList.length - 1; i >= 0 ; i--) {
                String temp = codeList[i];
                for (int j = temp.length() - 1; j >= 0; j--) {
                    System.out.print(temp.charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
