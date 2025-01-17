package AlgorithmCodingTest_JAVA.Chapter1_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q011 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = 1;
            int temp = Integer.parseInt(bf.readLine());

            while (num <= temp) {
                arr.add(num);
                num++;
            }


        }
    }
}
