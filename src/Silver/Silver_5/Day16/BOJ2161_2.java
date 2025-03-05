package Silver.Silver_5.Day16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2161_2 {
    //자료구조(queue-FIFO)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> myArr = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            myArr.add(i);
        }

        while (true) {
            int temp = myArr.poll();
            System.out.print(temp + " ");

            if (myArr.isEmpty()) break;

            temp = myArr.poll();
            myArr.add(temp);
        }
    }
}
