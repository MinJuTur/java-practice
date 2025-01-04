package OPP_practice.lab5;

public class MyQueue implements Queue {
    private static int front, back, capacity;
    private static int queue[];
    private final int INC_SIZE = 3;

    public MyQueue(int size) {
        front = back = 0;
        capacity = size;
        queue = new int[capacity];
    }

    public void enqueue(int item) {

        // (문제5-1) 구현 위치
        if (back >= capacity) {
            System.out.println("Queue is full... increasing capacity from " + capacity + " to " + (capacity + 3));
            capacity += 3;
            int[] tempQueue  = queue;
            queue = new int[capacity];
            for (int i = 0; i < tempQueue.length; i++) {
                queue[i] = tempQueue[i];
            }
        }

        queue[back++] = item;
    }

    public int dequeue() {

        // (문제5-1) 구현 위치
        int removed = queue[front];
        queue[front++] = 0;
        return removed;
    }

    public void display() {

        // (문제5-1) 구현 위치
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("[ ");
            for (int e:queue ) {
                if (e != 0) {
                    System.out.print(e + " ");
                }
            }
            System.out.println("]");
        }
    }

    @Override
    public boolean isEmpty() {

        // (문제5-1) 구현 위치
        return front == back;
    }
}
