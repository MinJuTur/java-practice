package Bronze.Bronze_1.Day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14696 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine()); //라운드 수
        StringTokenizer st;
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            int ACnt = Integer.parseInt(st.nextToken());
            int[] A = new int[5]; //모양 각각에 대한 count 저장, index가 모양을 의미함
            for (int j = 0; j < ACnt; j++) {
                int temp = Integer.parseInt(st.nextToken());
                A[temp]++;
            }

            st = new StringTokenizer(bf.readLine());
            int BCnt = Integer.parseInt(st.nextToken());
            int[] B = new int[5];
            for (int j = 0; j < BCnt; j++) {
                int temp = Integer.parseInt(st.nextToken());
                B[temp]++;
            }

            boolean isNone = true;
            for (int j = 4; j > 0; j--) {
                if (A[j] > B[j]) {
                    isNone = false;
                    System.out.println("A");
                    break;
                } else if (A[j] < B[j]) {
                    isNone = false;
                    System.out.println("B");
                    break;
                }
            }
            if (isNone) System.out.println("D");
        }
    }
}
