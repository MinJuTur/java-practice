package Bronze_2.Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ3052_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> rests = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int rest = num % 42;
            boolean include = false;
            for (Integer integer : rests) {
                if (integer == rest) {
                    include = true;
                }
            }
            if (!include) {
                rests.add(rest);
            }
        }

        System.out.println(rests.size());
    }
}
