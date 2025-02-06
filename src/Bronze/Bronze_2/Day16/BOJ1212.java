package Bronze.Bronze_2.Day16;

import java.util.Scanner;

public class BOJ1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int temp = Integer.parseInt(String.valueOf(arr[i]));

            if (i == 0) { //2진수로 표현했을 때 맨 앞자리 숫자가 0 이면 안 됨.
                if (temp == 0) System.out.print("0");
                else if (temp == 1) System.out.print("1");
                else if (temp == 2) System.out.print("10");
                else if (temp == 3) System.out.print("11");
            } else {
                if (temp == 0) System.out.print("000");
                else if (temp == 1) System.out.print("001");
                else if (temp == 2) System.out.print("010");
                else if (temp == 3) System.out.print("011");
            }

            if (temp == 4) System.out.print("100");
            else if (temp == 5) System.out.print("101");
            else if (temp == 6) System.out.print("110");
            else if (temp == 7) System.out.print("111");
        }
    }
}
