public class MyQueue {

    int[] queue;
    int i = -1;

    public MyQueue() {
        queue = new int[10];
    }

    public void Enqueue(int value) {
        if (i + 1 >= queue.length) {
            int[] bigQueue = new int[queue.length + 10];
            for (int j = 0; j <= i; j++) {
                bigQueue[j] = queue[j];
            }
            queue = bigQueue;
        }
        queue[++i] = value;
        PrintQueue();
    }

    public int Dequeue() {
        if (i == -1) {
            System.out.println("Under flow");
            return 0;
        }
        int value = queue[0];
        i--;
        for (int j = 0; j <= i; j++) {
            queue[j] = queue[j + 1];
        }
        PrintQueue();
        return value;
    }

    public int Front() {
        if (i == -1) {
            System.out.println("Under flow");
            return 0;
        }
        return queue[0];
    }

    public boolean IsEmpty() {
        return i == -1;
    }

    public void PrintQueue() {
        System.out.print("[");
        for (int j = 0; j <= i; j++)
            System.out.print(queue[j] + ", ");
        System.out.print("]\n");
    }
}