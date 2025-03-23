package Silver.Silver_4.Day1;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ9012_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            char[] arr = st.nextToken().toCharArray();

            Stack<Character> stack = new Stack<>();
            boolean isDone = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == '(') {
                    stack.push(arr[j]);
                } else {
                    if (stack.empty()) {
                        bw.append("NO" + "\n");
                        isDone = true;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (!isDone) {
                if (stack.empty()) bw.append("YES" + "\n");
                else bw.append("NO" + "\n");
            }
        }

        bw.flush();
        bw.close();

    }
}
