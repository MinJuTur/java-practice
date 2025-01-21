package Bronze_1.Day7;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        while (true) {
            if (N < B) {
                arr.add(N);
                break;
            }
            int rest = N % B;
            arr.add(rest);
            N = N / B;

        }
        for (int i = arr.size() -1; i >= 0 ; i--) {
            int temp = arr.get(i);
            if (temp >= 10) System.out.print((char) (temp - 10 + 'A'));
            else System.out.print(temp);
        }
    }
}
