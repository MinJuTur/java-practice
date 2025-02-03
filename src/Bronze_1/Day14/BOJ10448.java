package Bronze_1.Day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10448 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[45]; //i=44일 때 990이므로
        for(int i = 1; i < arr.length; i++) {
            arr[i] = i*(i+1)/2;
        }

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            int temp = Integer.parseInt(bf.readLine());
            boolean isOK = false;
            for (int j = 1; j < 45; j++) {
                for (int k = 1; k < 45; k++) {
                    for (int l = 1; l < 45; l++) {
                        if ((arr[j] + arr[k] + arr[l]) == temp) {
                            isOK = true;
                            break;
                        }
                    }
                    if (isOK) break;
                }
                if (isOK) break;
            }
            if (isOK) System.out.println(1);
            else System.out.println(0);
        }
    }
}
