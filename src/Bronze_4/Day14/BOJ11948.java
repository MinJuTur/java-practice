package Bronze_4.Day14;

import java.util.*;

public class BOJ11948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> scores1 = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            scores1.add(sc.nextInt());

        }
        Collections.sort(scores1, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            sum += scores1.get(i);
        }

        sum += Math.max(sc.nextInt(), sc.nextInt());

        System.out.println(sum);
    }
}
