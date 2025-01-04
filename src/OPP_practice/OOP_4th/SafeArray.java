package OPP_practice.OOP_4th;

public class SafeArray {
    private int[] a;
    public int length;

    public SafeArray(int size) {
        a = new int[size];
        length = size;
    }

    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        }
        return a[index];
    }

    public void put(int index, int value) {
        if (index < 0 || index >= length) {
            System.out.println("잘못된 인덱스 " + index);
        } else {
            a[index] = value;
        }
    }
}
