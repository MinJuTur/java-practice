package OPP_practice.lab5;

public class Lab5 {
    public static void main(String[] args) {
        System.out.println("---(문제5-1)---");
        MyQueue q = new MyQueue(3);
        q.display();
        q.enqueue(10);
        q.display();
        q.enqueue(20);
        q.display();
        q.enqueue(30);
        q.display();
        q.enqueue(40);
        q.display();
        q.enqueue(50);
        q.display();
        q.enqueue(60);
        q.display();
        q.enqueue(70);
        q.display();

        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();

    }
}
