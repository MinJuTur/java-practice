package Bronze.Bronze_4.Day15;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ5575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int s1 = Integer.parseInt(st.nextToken());
            int totalTime1 = h1*3600 + m1*60 + s1;

            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());
            int totalTime2 = h2*3600 + m2*60 + s2;

            int workTime = totalTime2 - totalTime1;
            int work_h = workTime / 3600;
            int work_m = (workTime % 3600) / 60;
            int work_s = (workTime % 3600) % 60;

            System.out.println(work_h + " " + work_m + " " + work_s);
        }
    }
}
