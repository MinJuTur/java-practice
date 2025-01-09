package Bronze_2.Day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1009_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine()); //테스트 케이스 개수
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken()); //밑
            int b = Integer.parseInt(st.nextToken()); //지수

            ArrayList<Integer> arr = new ArrayList<>(); //일의 자리 수를 담는 배열
            int temp = a % 10;
            arr.add(temp);
            for (int j = 0; j < b; j++) {
                temp = (temp * a) % 10;
                if (arr.contains(temp)) break;
                else arr.add(temp);
            }

            int num;
            if (arr.size() == 1) {
                num = arr.get(0);
            } else {
                int index = b % arr.size();
                if (index == 0) num = arr.get(arr.size()-1);
                else num = arr.get(index-1);
            }

            if (num == 0) System.out.println(10);
            else System.out.println(num);
        }
    }
}
