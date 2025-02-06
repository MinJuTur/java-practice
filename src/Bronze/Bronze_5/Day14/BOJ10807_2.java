package Bronze.Bronze_5.Day14;

import java.util.Scanner;

public class BOJ10807_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //배열의 인덱스는 입력받은 숫자 자체를 의미
        //배열은 각 숫자가 입력받은 횟수를 저장
        int counts[] = new int[201];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            counts[num + 100]++;
        }
        int v = sc.nextInt();
        System.out.println(counts[v+100]);
    }
}
