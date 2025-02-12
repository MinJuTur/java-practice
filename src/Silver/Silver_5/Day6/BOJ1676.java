package Silver.Silver_5.Day6;

import java.util.Scanner;

public class BOJ1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count_2 = 0;
        int count_5 = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0){
                int temp_count_2 = 1;
                while (true) {
                    if (i % Math.pow(2,temp_count_2) != 0) {
                        temp_count_2--;
                        count_2 += temp_count_2;
                        break;
                    }
                    temp_count_2++;
                }
            }

            if (i % 5 == 0){
                int temp_count_5 = 1;
                while (true) {
                    if (i % Math.pow(5,temp_count_5) != 0) {
                        temp_count_5--;
                        count_5 += temp_count_5;
                        break;
                    }
                    temp_count_5++;
                }
            }
        }

        System.out.println(Math.min(count_2, count_5));
    }
}
