package AlgorithmCodingTest_JAVA.Chapter1_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Q011 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        ArrayList<String> answer = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        int num = 1; //오름차순 자연수 수열의 역할을 한다. 항상 +1씩만 할 수 있다.
        boolean isPossible = true;
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(bf.readLine());
            while (current >= num) {
                stack.push(num++);
                answer.add("+");
            }
            int pop = stack.pop();
            if (pop != current) {
                isPossible = false;
                break;
            } else answer.add("-");
        }

        if (isPossible) {
            for (String s : answer) {
                System.out.println(s);
            }
        } else {
            System.out.println("NO");
        }
    }
}
