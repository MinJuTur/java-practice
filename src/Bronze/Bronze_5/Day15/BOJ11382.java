package Bronze.Bronze_5.Day15;

import java.util.Scanner;

public class BOJ11382 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int 사용 시 자료형의 표현범위를 넘어섬
        //long, nextLong()을 사용함
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        System.out.println(A+B+C);
    }
}
