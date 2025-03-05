package Silver.Silver_5.Day16;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ2161_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> stack = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            stack.add(i);
        }

        for (int i = 0; i < stack.size(); i++) {
            int temp = stack.get(i);
            if (i % 2 == 0) {
                System.out.print(temp + " ");
            } else if (stack.size() - 1 == i){
                System.out.print(temp);
                break;
            } else stack.add(temp);
        }
    }
}
