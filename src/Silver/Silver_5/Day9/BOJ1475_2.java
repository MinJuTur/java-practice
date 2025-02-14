package Silver.Silver_5.Day9;

import java.util.Scanner;

public class BOJ1475_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] N = sc.next().toCharArray();
        int[] countArr = new int[10];

        for (int i = 0; i < N.length; i++) {
            int temp = Integer.parseInt(String.valueOf(N[i]));
            countArr[temp]++;
        }

        //세트의 개수는 가장 많이 나온 숫자 count 만큼 필요함
        //그러나 6 또는 9는 같은 두 개가 모일 때마다 한 세트만 필요함 -> 하나의 숫자 count 로 취급
        int countMax = Integer.MIN_VALUE;
        int count_69 = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (i == 6 || i == 9) count_69 += countArr[i]; //하나의 숫자 count 로 취급하기 위해 합침
            else if (countArr[i] > countMax) countMax = countArr[i];
        }

        System.out.println(Math.max(countMax, count_69 % 2 == 0?count_69/2:count_69/2+1));
    }
}
