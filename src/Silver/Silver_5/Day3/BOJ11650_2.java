package Silver.Silver_5.Day3;

import java.util.*;

public class BOJ11650_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr);

        for (Point point : arr) {
            System.out.println(point.x + " " + point.y);
        }
    }
}

class Point implements Comparable<Point> {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}
