package Silver.Silver_5.Day17;

import java.util.Scanner;

public class BOJ1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String find = sc.nextLine();

        int count = 0;
        for (int i = 0; i < text.length() - find.length() + 1;) {
            String temp = text.substring(i, i + find.length());
            if (temp.equals(find)) {
                i += find.length();
                count++;
            } else i++;
        }

        System.out.println(count);
    }
}
