public class MyLinkedList {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    Node head = null;

    public void Insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void Delete(int value) {
        if (head == null) {
            System.out.println("List is empty");
        }
        if (head.value == value) {
            head = head.next;
            System.out.println(value + " deleted.");
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.value != value) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println(value + " not found.");
            return;
        }
        temp.next = temp.next.next;
        System.out.println(value + " deleted.");
    }

    public boolean Search(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.value == value) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public void Display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
