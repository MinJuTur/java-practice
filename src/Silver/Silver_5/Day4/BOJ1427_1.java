package Silver.Silver_5.Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ1427_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String temp = sc.next();

        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < temp.length(); i++) {
            A.add(Integer.parseInt(String.valueOf(temp.charAt(i))));
        }
        Collections.sort(A, Collections.reverseOrder());

        for (int i : A) {
            System.out.print(i);
        }
    }
}
