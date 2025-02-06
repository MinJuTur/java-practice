package Bronze.Bronze_1.Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        char[] arr = bf.readLine().toCharArray();
        for (int i = 0; i < N - 1; i++) {
            char[] temp = bf.readLine().toCharArray();
            for (int j = 0; j < temp.length; j++) {
                if (arr[j] != temp[j]) arr[j] = '?';
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
