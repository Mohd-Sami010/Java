import java.util.Scanner;
import java.util.ArrayList;

public class LibraryManagementSystem {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> booksInLibrary = new ArrayList<>();

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
        System.out.print("\nEnter name of book: ");
        String name = scanner.nextLine();

        for (Book book : booksInLibrary) {
            if (book.name.equalsIgnoreCase(name)) {
                if (book.amount > 0) {
                    book.amount--;
                    System.out.println(book.name + " Issued succesfully");
                } else {
                    System.out.println(book.name + " Is Out Of Stock");
                }
                return;
            }
        }
        System.out.println(name + " Not found");
    }

    private void ReturnBook() {
        System.out.print("\nEnter name of book: ");
        String name = scanner.nextLine();

        for (Book book : booksInLibrary) {
            if (book.name.equalsIgnoreCase(name)) {
                book.amount++;
                System.out.println(book.name + " Returned succesfully");
                return;
            }
        }
        System.out.println(name + " Not found");
    }

    private void SearchBook() {
        System.out.print("\nEnter name of book: ");
        String name = scanner.nextLine();

        for (Book book : booksInLibrary) {
            if (book.name.equalsIgnoreCase(name)) {
                if (book.amount > 0)
                    System.out.println(book.amount + " " + book.name + " are available");
                else
                    System.out.println(book.name + " is Out of stock");
                return;
            }
        }
        System.out.println(name + " Not found");
    }

    private void ViewInventory() {
        System.out.println("\nINVENTORY");
        System.out.println("Available in Libary:");
        for (Book book : booksInLibrary) {
            if (book.amount > 0)
                System.out.println(book.amount + ": " + book.name);
        }
        System.out.println("Out of Stock:");
        for (Book book : booksInLibrary) {
            if (book.amount == 0)
                System.out.println(book.name);
        }
    }

    private void AddBook() {
        System.out.print("\nEnter book name:");
        String bookName = scanner.nextLine();

        System.out.print("Enter number of \"" + bookName + "\" to add: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        Book book = new Book(bookName, amount);
        booksInLibrary.add(book);
    }
}
