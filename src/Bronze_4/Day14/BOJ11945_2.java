package Bronze_4.Day14;

import java.util.Scanner;

public class BOJ11945_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // sc.hasNext() -> m > 0 일 때만 출력됨
            while (sc.hasNext()) {
                StringBuilder shape = new StringBuilder(sc.next());
                System.out.println(shape.reverse());
            }
        }
    }
}
