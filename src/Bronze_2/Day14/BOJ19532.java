package Bronze_2.Day14;

import java.util.Scanner;

public class BOJ19532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr1 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        double[] arr2 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        double m1 = arr1[0];
        double m2 = arr2[0];
        for (int i = 0; i < 3; i++) { //x의 계수를 1로 만들기
            arr1[i] /= m1;
            arr2[i] /= m2;
        }

        double[] temp = {0, arr1[1] - arr2[1], arr1[2] - arr2[2]};

        int y = (int) (temp[2] / temp[1]);
        int x = (int) (arr1[2] - arr1[1] * y);

        System.out.println(x + " " + y);
    }
}
