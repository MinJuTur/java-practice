package Bronze.Bronze_1.Day9;

import java.util.Scanner;

public class BOJ1292_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt() - 1;
        int B = sc.nextInt();
        int answer = 0;
        int B_sum = 0;
        int A_sum = 0;

        //B번째 수가 어떤 수의 몇 번째 수인지 구한다. -> i인 수의 temp번째 수.
        int i = 1; //i인 수
        int temp = B; //temp번째
        while (temp >= i) {
            temp -= i;
            B_sum += i*i;
            i++;
        }
        B_sum += temp * i;

        //(A-1)번째 수가 어떤 수의 몇 번째 수인지 구한다. -> i인 수의 temp번째 수.
        i = 1;
        temp = A;
        while (temp >= i) {
            temp -= i;
            A_sum += i*i;
            i++;
        }
        A_sum += temp * i;

        answer = B_sum - A_sum;
        System.out.println(answer);
    }
}
