package AlgorithmCodingTest_JAVA.Chapter1_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Q014 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine()); //연산의 개수

        //양수 -> 우선순위 o1 < o2
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2)->{
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            //절댓값이 같은 경우 음수 우선
            if (first_abs == second_abs) {
                return o1 > o2 ? 1 : -1;
            }
            //절댓값이 작은 데이터 우선
            return first_abs - second_abs;
        });

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(bf.readLine());
            if (temp == 0) {
                if (myQueue.isEmpty()) System.out.println(0);
                else System.out.println(myQueue.poll());
            } else {
                myQueue.add(temp);
            }
        }
    }
}
