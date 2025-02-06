package Bronze.Bronze_2.Day17;

import java.util.Scanner;

public class BOJ1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color1 = sc.next();
        String color2 = sc.next();
        String color3 = sc.next();

        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        int num1 = 1;
        int num2 = 1;
        long num3 = 1;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(color1)) num1 = i*10;
            if (colors[i].equals(color2)) num2 = i;
            if (colors[i].equals(color3)) num3 = (long) Math.pow(10, i);
        }

        System.out.println((num1 + num2) * num3);
    }
}