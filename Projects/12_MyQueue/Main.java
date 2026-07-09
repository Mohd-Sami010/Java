public class Main {
    public void main() {
        MyQueue queue = new MyQueue();

        queue.Enqueue(10);
        queue.Enqueue(12);
        queue.Enqueue(2);
        queue.Enqueue(9);
        queue.Dequeue();
        queue.Enqueue(19);
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();
        System.out.println("Element at front: " + queue.Front());
        queue.Dequeue();
        System.out.println("Element at front: " + queue.Front());
    }
}
