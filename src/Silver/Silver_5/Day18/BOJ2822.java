package Silver.Silver_5.Day18;

import java.util.*;

public class BOJ2822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Score> scores = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            int value = sc.nextInt();
            scores.add(new Score(i, value));
        }

        Collections.sort(scores, new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                return o2.value - o1.value;
            }
        });

        int sum = 0;
        int[] numArr = new int[5]; //가장 높은 점수인 다섯 개의 문제번호 저장
        for (int i = 0; i < 5; i++) {
            sum += scores.get(i).value;
            numArr[i] = scores.get(i).num;
        }
        System.out.println(sum);

        Arrays.sort(numArr);
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
    }
}

class Score{
    int num;
    int value;

    public Score(int num, int value) {
        this.num = num;
        this.value = value;
    }
}
