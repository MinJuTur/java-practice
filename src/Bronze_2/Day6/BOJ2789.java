package Bronze_2.Day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()); //N=카드의 개수
        int M = Integer.parseInt(st.nextToken()); //합이 M을 넘지 않아야 함.
        int sum = 0;

        st = new StringTokenizer(bf.readLine());
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp < M) nums.add(temp);
        }
        Collections.sort(nums, Collections.reverseOrder()); //내림차순 정렬

        boolean isFind = false;

        for (int i = 0; i < nums.size()-2; i++) {
            if (isFind) break;
            int first = nums.get(i);
            for (int j = i+1; j < nums.size()-1; j++) {
                if (isFind) break;
                int second = nums.get(j);
                for (int k = j+1; k < nums.size(); k++) {
                    int third = nums.get(k);
                    sum = first + second + third;
                    if (sum <= M) {
                        isFind = true;
                        break;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
