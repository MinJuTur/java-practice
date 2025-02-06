package Bronze.Bronze_1.Day1;

import java.util.Scanner;

public class BOJ1157_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();
        int[] count = new int[26];
        //알파벳 사용 횟수 저장
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if (temp >= 'a') count[temp - 'a']++; //소문자일 때
            else count[temp - 'A']++; //대문자일 때
        }

        int maxCount = 0;
        int maxIndex = -1;
        int haveMax = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount){
                maxCount = count[i];
                maxIndex = i;
                haveMax = 1;
            } else if (count[i] == maxCount) haveMax++;
        }

        if (haveMax > 1) System.out.println("?");
        else System.out.println((char) (maxIndex + 'A'));
    }
}
