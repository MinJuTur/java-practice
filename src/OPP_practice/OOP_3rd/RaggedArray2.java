package OPP_practice.OOP_3rd;

import java.util.Arrays;

public class RaggedArray2 {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        array[0] = new int[3];
        array[1] = new int[4];
        array[2] = new int[2];

        int num = 1;
        for (int i = 0; i < array.length; i++) {
            for (int c = 0; c < array[i].length; c++) {
                array[i][c] = num;
                num++;
            }
        }

        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
