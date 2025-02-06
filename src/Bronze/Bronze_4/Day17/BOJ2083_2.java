package Bronze.Bronze_4.Day17;


import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ2083_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            if (name.equals("#"))break;

            if (age > 17 || weight >= 80) {
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }
        }
    }
}
