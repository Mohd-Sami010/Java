public class Main {
    public void main() {
        MyStack stack = new MyStack();

        stack.Push(12);
        stack.Push(32);
        stack.Push(13);
        stack.Push(0);
        stack.PrintStack();

        System.out.println("Popped: " + stack.Pop());
        stack.Push(89);
        stack.PrintStack();
        System.out.println("Popped: " + stack.Pop());
        System.out.println("Popped: " + stack.Pop());
        System.out.println("Popped: " + stack.Pop());
        System.out.println("Popped: " + stack.Pop());
        System.out.println("Popped: " + stack.Pop());
        System.out.println("Is empty: " + stack.IsEmpty());
    }
}