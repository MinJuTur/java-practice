package Silver.Silver_5.Day2;

import java.util.Scanner;

public class BOJ2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] croatia = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
        String A = sc.next();

        int count = 0;
        int index = 0;

        while (index < A.length()) {
            if (index == A.length() - 1){
                count++;
                break;
            }


            if (index <= A.length() - 3 && A.substring(index, index + 3).equals("dz=")) {
                index += 3;
                count++;
            } else {
                boolean isFound = false;
                for (int j = 0; j < croatia.length; j++) {
                    if (A.substring(index, index + 2).equals(croatia[j])) {
                        index += 2;
                        count++;
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) {
                    index++;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
