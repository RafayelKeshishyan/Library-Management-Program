//Rafayel Keshishyan
//Assignment2_Encapsulation

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean ava;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.ava = true;
    }

  
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return ava;
    }

    
    public void CheckoutBook() {
        if (ava) {
            System.out.println("Checked out " + title + " by: " + author + ".");
            ava = false;
        } else {
            System.out.println(title + " is not available for checkout.");
        }
    }

    public void ReturnBook() {
        if (!ava) {
            System.out.println("Returned " + title + " by: " + author + ".");
            ava = true;
        } else {
            System.out.println(title + " has not been checked out yet, it cannot be returned.");
        }
    }
}
