package Bronze.Bronze_2.Day6;

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

        st = new StringTokenizer(bf.readLine());
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp < M) nums.add(temp);
        }
        Collections.sort(nums, Collections.reverseOrder()); //내림차순 정렬

        int max = -1;
        for (int i = 0; i < nums.size()-2; i++) {
            for (int j = i+1; j < nums.size()-1; j++) {
                for (int k = j+1; k < nums.size(); k++) {
                    int temp = nums.get(i) + nums.get(j) + nums.get(k);
                    if (temp <= M && temp > max) {
                         max = temp;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
