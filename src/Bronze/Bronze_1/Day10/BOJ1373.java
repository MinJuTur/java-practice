package Bronze.Bronze_1.Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ1373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.nextLine().toCharArray(); //2진수
        ArrayList<Integer> answer = new ArrayList<>(); //8진수

        for (int i = arr.length - 1; i >= 0;) {
            //2진수 자릿수 3개 = 8진수 자릿수 1개
            int sum = 0;
            for (int j = 0; j < 3 &&  i >= 0; j++) {
                int temp = Integer.parseInt(String.valueOf(arr[i--]));
                int pow = (int) Math.pow(2, j);
                sum += temp * pow;
            }
            answer.add(sum);
        }

        for (int i = answer.size() - 1; i >= 0; i--) {
            System.out.print(answer.get(i));
        }
    }
}
