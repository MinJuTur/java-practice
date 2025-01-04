package OPP_practice.OOP_3rd;

import java.util.Arrays;

public class RaggedArray3 {
    public static void main(String[] args) {
        int[][] array = new int[4][];
        array[0] = new int[]{12};
        array[1] = new int[]{32, 12, 38};
        array[2] = new int[]{14, 6};
        array[3] = new int[]{3};


        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
