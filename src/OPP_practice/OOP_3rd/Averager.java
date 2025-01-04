package OPP_practice.OOP_3rd;

import java.util.Scanner;

public class Averager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("점수를 입력하시오: ");
            int inputValue = sc.nextInt();

            if (inputValue < 0) {
                break;
            }
            sum += inputValue;
            count++;
        }
        System.out.println("평균은 " + sum/count);
    }
}
