package Bronze.Bronze_2.Day12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //응시자 수
        int k = sc.nextInt(); //상을 받는 사람의 수

        Integer[] A = new Integer[N]; //각 학생의 점수
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        //sort()에 Collections.reverseOrder()를 인자로 전달하려면 배열은 Integer 자료형이어야 한다.
        Arrays.sort(A, Collections.reverseOrder());
        System.out.println(A[k-1]);

    }
}
