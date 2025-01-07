package Bronze_2.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10809_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 알파벳이 존재하는지, 처음 어디서 등장하는지 확인해야 함
        char[] S = br.readLine().toCharArray();

        // 출력을 알파벳 순서로 하기 때문에, 판단과 동시에 출력을 하기 위해서는 바깥 루프가 알파벳 중심이어야 한다.
        for (int i = 0; i < 26; i++) { // i -> a, b, c, ..., z 까지를 나타낼 역할.
            int temp = -1;
            for (int j = 0; j < S.length; j++) {
                //char == int 아스키코드로 비교 가능
                if (S[j] - 'a'== i) {
                    temp = j;
                    break;
                }
            }
            System.out.print(temp + " ");
        }
    }
}