package Bronze_4.Day10;

import java.util.Scanner;

public class BOJ5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vacationDays = sc.nextInt();
        int totalKorean = sc.nextInt();
        int totalMath = sc.nextInt();
        int MaxKorean = sc.nextInt();
        int MaxMath = sc.nextInt();

        int KoreanDays = totalKorean / MaxKorean;
        int mathDays = totalMath / MaxMath;
        int homeworkDays = Math.max(KoreanDays, mathDays);

        if (Math.min(totalKorean % MaxKorean, totalMath % MaxMath) != 0) {
            homeworkDays++;
        }

        System.out.println(vacationDays - homeworkDays);
    }
}