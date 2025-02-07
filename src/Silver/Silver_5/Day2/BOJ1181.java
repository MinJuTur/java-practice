package Silver.Silver_5.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        //중복 없애기
        Set<String> arr = new HashSet<>();
        for (int i = 0; i < N; i++) {
            arr.add(bf.readLine());
        }

        //사전 순으로 정렬하기
        List<String> A = new ArrayList<>(arr);
        Collections.sort(A);

        //길이 순으로 정렬하기
        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            String temp = A.get(i);

        }

    }
}
