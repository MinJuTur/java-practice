package Silver.Silver_5.Day9;

import java.util.Scanner;

public class BOJ1475_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] N = sc.next().toCharArray();
        int count = 0;

        int[][] Arr = new int[7][10];
        for (int i = 0; i < N.length; i++) {
            int temp = Integer.parseInt(String.valueOf(N[i]));
            boolean isFind = false;
            for (int j = 0; j < count; j++) {
                if (Arr[j][temp] == 0){
                    Arr[j][temp] = 1;
                    isFind = true;
                    break;
                } else if (temp == 6 && Arr[j][9] == 0) {
                    Arr[j][9] = 1;
                    isFind = true;
                    break;
                } else if (temp == 9 && Arr[j][6] == 0) {
                    Arr[j][6] = 1;
                    isFind = true;
                    break;
                }
            }
            if (!isFind){
                count++;
                Arr[count-1][temp] = 1;
            }
        }
        System.out.println(count);
    }
}
