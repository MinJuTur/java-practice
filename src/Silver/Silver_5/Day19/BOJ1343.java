package Silver.Silver_5.Day19;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BOJ1343 {
    public static void main(String[] args) throws IOException {
        //x가 짝수 개면 가능, .을 기점으로 초기화
        //4로 나눈 나머지가 홀수면 무조건 -1 출력하고 종료
        //출력하다가 -1을 출력하면 안되므로 어딘가에 출력값을 저장해둬야 함
        //입력 길이만큼의 새로운 배열을 만들자
        //.이면 그대로 출력하고 x개수 초기화
        //4로 나눈 몫만큼 AAAA 출력
        //4로 나눈 나머지가 짝수인지 확인 후 다시 그 값을 2로 나눈 몫만큼 BB 출력

        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = sc.next().toCharArray();

        int countX = 0;
        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];

            if (temp == '.') {
                if (countX % 2 != 0) {
                    System.out.println(-1);
                    return;
                } else {
                    for (int j = 0; j < (countX/4)*4; j++) {
                        bw.append('A');
                    }
                    for (int j = 0; j < countX%4; j++) {
                        bw.append('B');
                    }
                }
                bw.append('.');
                countX = 0;
            } else {
                countX++;
            }
        }

        if (countX != 0) {
            if (countX % 2 != 0) {
                System.out.println(-1);
                return;
            } else {
                for (int j = 0; j < (countX/4)*4; j++) {
                    bw.append('A');
                }
                for (int j = 0; j < countX%4; j++) {
                    bw.append('B');
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
