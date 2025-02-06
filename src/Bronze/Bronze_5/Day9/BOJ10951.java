package Bronze.Bronze_5.Day9;

import java.util.Scanner;

public class BOJ10951 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hasNext(): 다음에 입력받을 게 있을 때만
        while (sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
    }
}
