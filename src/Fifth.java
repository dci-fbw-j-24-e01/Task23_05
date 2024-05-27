import fifth.Book;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Fifth {
    @Test
    public void testMain() {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book1.setTitle("Title1");
        book1.setAuthor("Author1");
        book1.setPrice(1);
        book2.setTitle("Title2");
        book2.setAuthor("Author2");
        book2.setPrice(2);
        book3.setTitle("Title3");
        book3.setAuthor("Author3");
        book3.setPrice(3);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
