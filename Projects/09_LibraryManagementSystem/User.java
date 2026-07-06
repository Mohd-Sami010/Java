import java.awt.print.Book;
import java.util.ArrayList;

public class User {
    String name;
    int id;
    ArrayList<Book> books = new ArrayList<>();

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void IssueBook(Book book) {
        books.add(book);
    }
}
