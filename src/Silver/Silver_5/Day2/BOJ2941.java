package Silver.Silver_5.Day2;

import java.util.Scanner;

public class BOJ2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String croatia1 = "dz=";
        String[] croatia2 = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
        String text = sc.next();

        int count = text.length();

        for (int i = 0; i < text.length() - 1;) {
            if (i <= text.length() - 3 && text.substring(i, i + 3).equals(croatia1)) {
                i += 3;
                count -= 2;
            } else {
                boolean isFound = false;
                for (int j = 0; j < croatia2.length; j++) {
                    if (text.substring(i, i + 2).equals(croatia2[j])) {
                        i += 2;
                        count--;
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) i++;
            }
        }

        System.out.println(count);
    }
}