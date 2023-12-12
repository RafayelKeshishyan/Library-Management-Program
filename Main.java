//Rafayel Keshishyan
//Assignment2 Encapsulation

public class Main
{
    public static void main(String[] args)
    {
        Library library = new Library();
        library.AddBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780333791035"));
        library.AddBook(new Book("Of Mice and Men", "John Steinbeck","9781405855365"));

        library.CheckoutBook("The Great Gatsby");
        library.CheckoutBook("Of Mice and Men");
        library.ReturnBook("Of Mice and Men");
        library.ReturnBook("Of Mice and Men");
        library.CheckoutBook("The Catcher in the Rye");
    }
}
