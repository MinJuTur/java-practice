package Bronze_4.Day16;

import java.util.Scanner;

public class BOJ4470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //또는 int N = Integer.parseInt(sc.nextLine());
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= N; i++) {
            System.out.println(i + ". " + sc.nextLine());
        }
    }
}
