public class MyStack {
    // Push, Pop, Peek & isEmpty
    int[] stack;
    int i = -1;

    public MyStack() {
        stack = new int[10];
    }

    public void Push(int value) {
        if (i + 1 == stack.length) {
            int[] newStack = new int[stack.length + 10];
            for (int j = 0; j <= i; j++) {
                newStack[j] = stack[j];
            }
            stack = newStack;
        }
        stack[++i] = value;
    }

    public int Pop() {
        if (i == -1) {
            System.out.println("Underflow");
            return 0;
        }
        return stack[i--];
    }

    public int Peek() {
        return stack[i];
    }

    public boolean IsEmpty() {
        return i == -1;
    }

    public void PrintStack() {
        System.out.print("[ ");
        for (int j = 0; j <= i; j++) {
            System.out.print(stack[j] + ", ");
        }
        System.out.println("]");
    }

}