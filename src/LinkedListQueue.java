public class LinkedListQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(3);
        q.enqueue(5);
        System.out.println(q.dequeue());
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(15);
        q.enqueue(16);
        q.display();

        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}
