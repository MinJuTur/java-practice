package Silver.Silver_4.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bf.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            int temp = Integer.parseInt(bf.readLine());
            if (temp == 0) stack.pop();
            else stack.push(temp);
        }

        int sum = 0;
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }

        System.out.println(sum);
    }
}
