//Rafayel Keshishyan
//Assignment2_Encapsulation

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookCollection;

    public Library() {
        bookCollection = new ArrayList<>();
    }

    public void AddBook(Book book) {
        bookCollection.add(book);
    }

    public void CheckoutBook(String title) {
        boolean bookFound = false;
        for (Book book : bookCollection) {
            if (book.getTitle().equals(title)) {
                book.CheckoutBook();
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book of title: " + title + " not found in the library.");
        }
    }

    public void ReturnBook(String title) {
        boolean bookFound = false;
        for (Book book : bookCollection) {
            if (book.getTitle().equals(title)) {
                book.ReturnBook();
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book of title: " + title + " not found in the library.");
        }
    }
}