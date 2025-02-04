package Bronze_1.Day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2846_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int Max = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i-1] < A[i]){
                sum += A[i] - A[i-1];
                if (sum > Max) Max = sum;
            } else{
                sum = 0;
            }
        }

        System.out.println(Max);
    }
}
