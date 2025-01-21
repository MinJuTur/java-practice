package Bronze_1.Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(bf.readLine());
            if (n == -1) break;

            int sum = 0; //약수들의 합
            ArrayList<Integer> arr = new ArrayList<>(); //약수 저장(오름차순)
            for (int i = 1; i < n; i++) {
                if ((n % i) == 0) {
                    arr.add(i);
                    sum += i;
                }
            }
            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < arr.size(); i++) {
                    System.out.print(arr.get(i));
                    if (i == arr.size() - 1) System.out.println();
                    else System.out.print(" + ");
                }
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
