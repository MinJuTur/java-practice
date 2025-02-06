package Bronze.Bronze_3.Day1;

import java.util.Scanner;

public class BOJ2588_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        //인덱스를 사용해야 할 때 -> charAt() 메서드 사용 or toCharArray()로 받아 char 배열을 이용
        char[] num2 = sc.next().toCharArray();
        int[] su = {100, 10, 1};
        int sum = 0;

        for (int i = num2.length - 1; i >= 0; i--) { //i = 2, 1, 0
            //String.valueOf() 메서드 -> 어떤 형이더라도 String으로 변환해줌
            int value = num1 * Integer.parseInt(String.valueOf(num2[i]));
            System.out.println(value);
            sum += value * su[i];
        }
        System.out.println(sum);
    }
}
