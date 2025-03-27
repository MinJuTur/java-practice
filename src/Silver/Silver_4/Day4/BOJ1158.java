package Silver.Silver_4.Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            arr.add(i);
        }

        ArrayList<Integer> result = new ArrayList<>();
        int index = -1;
        while (!arr.isEmpty()) {
            for (int i = 0; i < K; i++) {
                index++;
                if (index > arr.size() - 1) index = 0;
            }
            int removed = arr.remove(index);
            result.add(removed);
            index--;
        }

        System.out.print("<");
        for (int i = 0; i < N; i++) {
            System.out.print(result.get(i));
            if (i != N-1) System.out.print(", ");
            else System.out.print(">");
        }
    }
}
