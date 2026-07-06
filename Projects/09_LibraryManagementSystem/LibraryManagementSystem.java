import java.util.Scanner;
import java.awt.print.Book;
import java.util.ArrayList;

public class LibraryManagementSystem {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> booksInLibrary = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public void main() {
        System.out.println("\n\tLIBRARY");
        while (true) {
            System.out.print(
                    "\n1. Issue book\n2. Return book\n3. Search book\n4. View Inventory\n5. Add book\nEnter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    IssueBook();
                    break;
                case 2:
                    ReturnBook();
                    break;
                case 3:
                    SearchBook();
                    break;
                case 4:
                    ViewInventory();
                    break;
                case 5:
                    AddBook();
                    break;
                default:
                    System.out.println("Enter a valid option!");
                    continue;
            }
            System.out.print("Do you want to continue? (y/n): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Thanks for Using :)");
                break;
            }
        }
    }

    private void IssueBook() {

    }

    private void ReturnBook() {

    }

    private void SearchBook() {

    }

    private void ViewInventory() {
        System.out.println("\nINVENTORY");
        System.out.println("Available in Libary:");
        for (Book book : booksInLibrary) {
            System.out.println(book.amount + ": " + book.name);
        }

        System.out.println("\nBooks issued by users:");
        for (User user : users) {
            System.out.print("#id" + user.id + " " + user.name + ": ");
            for (Book book : user.books) {
                System.out.print(book.name + ": " + book.amount + ", ");
            }
            System.out.println("");
        }
    }

    private void AddBook() {
        System.out.print("\nEnter book name:");
        String bookName = scanner.nextLine();

        System.out.print("\nEnter number of \"" + bookName + "\" to add: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        Book book = new Book(bookName, amount);
        booksInLibrary.add(book);
    }
}
