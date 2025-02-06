package Bronze.Bronze_1.Day2;

import java.util.Scanner;

public class BOJ2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //낮 +A
        int B = sc.nextInt(); //밤 -B
        int V = sc.nextInt(); //막대기 길이

        //
        int day = (V-B) / (A-B);
        if (((V-B) % (A-B)) != 0) day++;

        System.out.println(day);
    }
}
