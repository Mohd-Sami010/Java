public class Main {
    public void main() {
        MyLinkedList list = new MyLinkedList();

        // Insert elements
        list.Insert(10);
        list.Insert(20);
        list.Insert(30);
        list.Insert(40);

        System.out.println("Linked List:");
        list.Display();

        // Search
        System.out.println("\nSearching 20...");
        if (list.Search(20))
            System.out.println("20 Found");
        else
            System.out.println("20 Not Found");

        System.out.println("\nSearching 50...");
        if (list.Search(50))
            System.out.println("50 Found");
        else
            System.out.println("50 Not Found");

        // Delete
        System.out.println("\nDeleting 20...");
        list.Delete(20);
        list.Display();

        System.out.println("\nDeleting 50...");
        list.Delete(50);

        System.out.println("\nFinal Linked List:");
        list.Display();
    }
}
