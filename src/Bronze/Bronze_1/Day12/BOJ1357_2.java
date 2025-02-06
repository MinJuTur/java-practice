package Bronze.Bronze_1.Day12;

import java.util.Scanner;

public class BOJ1357_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println(Rev(Rev(X) + Rev(Y)));
    }

    private static int Rev(int x) {
        char[] arr = String.valueOf(x).toCharArray();

        String reversed = "";
        boolean isFirst_0 = true;
        for (int i = arr.length - 1; i >= 0; i--) {
            char temp = arr[i];
            if (i == arr.length - 1 && temp == '0') continue;
            if (temp != '0') isFirst_0 = false;

            reversed += temp;
        }
        return Integer.parseInt(reversed);
    }
}
