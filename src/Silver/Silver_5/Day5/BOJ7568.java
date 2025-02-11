package Silver.Silver_5.Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<People> peopleArrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            peopleArrayList.add(new People(x, y));
        }

        for (int i = 0; i < peopleArrayList.size(); i++) {
            People person = peopleArrayList.get(i);
            int count = 0;

            for (int j = 0; j < peopleArrayList.size(); j++) {
                People temp = peopleArrayList.get(j);
                if (person.x < temp.x && person.y < temp.y) count++;
            }
            System.out.print((count + 1) + " ");
        }
    }
}

class People {
    int x;
    int y;

    public People(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
