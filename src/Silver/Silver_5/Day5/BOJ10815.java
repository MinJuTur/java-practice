package Silver.Silver_5.Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(bf.readLine());
        ArrayList<Card> B = new ArrayList<>();
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < M; i++) {
            int number = Integer.parseInt(st.nextToken());
            B.add(new Card(i, number));
        }
        B.sort(Comparator.comparingInt(o -> o.number));

        int[] answer = new int[M];
        int now = 0;
        for (int i = 0; i < N && now < M;) {
            Card nowCard = B.get(now);
            if (A[i] == nowCard.number){
                answer[nowCard.index] = 1;
                i++;
                now++;
            } else if (A[i] > nowCard.number) {
                answer[nowCard.index] = 0;
                now++;
            } else {
                i++;
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}

class Card {
    int index;
    int number;

    public Card(int index, int number) {
        this.index = index;
        this.number = number;
    }
}
