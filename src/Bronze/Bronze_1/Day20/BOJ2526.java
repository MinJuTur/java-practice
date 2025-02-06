package Bronze.Bronze_1.Day20;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ2526 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int P = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();

        int temp = N;
        while (true) {
            temp = (temp * N) % P;
            int isHaveIndex = isHave(A, temp);
            if (isHaveIndex != -1){ //반복구간을 찾았을 때
                System.out.println(A.size() - isHaveIndex);
                break;
            } else A.add(temp);
        }
    }

    private static int isHave(ArrayList<Integer> arr, int temp) {
        int isHaveIndex = -1; //반복이 시작되는 지점의 인덱스
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == temp) {
                isHaveIndex = i;
                break;
            }
        }

        return isHaveIndex;
    }
}
