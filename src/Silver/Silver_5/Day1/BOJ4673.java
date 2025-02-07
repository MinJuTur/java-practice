package Silver.Silver_5.Day1;

public class BOJ4673 {
    public static void main(String[] args) {
        int[] A = new int[10000 + 1];

        for (int i = 1; i < 10000; i++) {
            int sum = i + i/1000 + (i/100)%10 + (i/10)%10 + i%10;
            if (sum < 10001) A[sum]++;
        }

        for (int i = 1; i < A.length; i++) {
            if (A[i] == 0) System.out.println(i);
        }
    }
}
