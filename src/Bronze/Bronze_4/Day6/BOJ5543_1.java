package Bronze.Bronze_4.Day6;

import java.util.Scanner;

public class BOJ5543_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] burgers = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] drinks = {sc.nextInt(), sc.nextInt()};
        int[] prices = new int[6];

        int n = 0;
        for (int i = 0; i < burgers.length; i++) {
            for (int j = 0; j < drinks.length; j++) {
                prices[n] = burgers[i] + drinks[j] - 50;
                n++;
            }
        }
        int cheapest = prices[0];

        for (int price : prices) {
            if (price < cheapest) {
                cheapest = price;
            }
        }

        System.out.println(cheapest);
    }
}
