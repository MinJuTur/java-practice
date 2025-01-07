package Bronze_2.Day1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ3052_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Set: 중복된 값을 허용하지 않는다. 순서와 인덱스가 존재하지 않는다.
        //HashSet: Set 인터페이스에서 지원하는 구현 클래스.
        Set<Integer> rests = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int rest = num % 42;
            rests.add(rest);
        }

        System.out.println(rests.size());
    }
}
