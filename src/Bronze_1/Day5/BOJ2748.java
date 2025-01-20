package Bronze_1.Day5;

import java.util.Scanner;

public class BOJ2748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //n번째 피보나치 수 출력하기(1<=n<=90)

        long[] arr = new long[n+1]; //매우 큰 수가 저장될 수 있음 -> long 배열 사용
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[n]);
    }
}
