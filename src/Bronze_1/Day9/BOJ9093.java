package Bronze_1.Day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            String answer = "";
            StringBuilder sb = new StringBuilder(answer);
            String[] arr = bf.readLine().split(" "); //문장 한 개를 받음.
            for (int j = 0; j < arr.length; j++) { //문장 속 단어를 한 개씩 꺼내기.
                String temp = arr[j];
                for (int k = temp.length() - 1; k >= 0 ; k--) {
                    sb.append(temp.charAt(k));
                }
                sb.append(" ");
            }
            System.out.println(sb);
        }
    }
}
