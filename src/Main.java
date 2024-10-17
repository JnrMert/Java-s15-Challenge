import com.workintech.challenge.model.Book;
import com.workintech.challenge.model.Librarian;
import com.workintech.challenge.model.Reader;
import com.workintech.challenge.util.EnumTypes.UserRole;

import java.util.Date;

import static com.workintech.challenge.util.EnumTypes.BookStatus.AVAILABLE;

public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian(1, "David Doe", "john.doe@example.com", UserRole.LIBRARIAN);
        Reader reader = new Reader(2, "Jane Doe", "yzc.mert@icloud.com", UserRole.READER);
        Book book = new Book(1, "Java Programming", "John Doe", 212.00, "10", new Date() , AVAILABLE, "1234567890");
        System.out.println(reader.whoYouAre());
    }
}