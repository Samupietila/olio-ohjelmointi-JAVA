package module2_3.Task3;

public class LibraryMain {
    public static void main(String[] args) {
        Library library;
        Book book, book2, book3;

        book2 = new Book("Book2", "Author2", 2002);
        book3 = new Book("Book3", "Author3", 2003);
        book = new Book("Book1", "Author1", 2001);
        library = new Library();
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.getBooks();
        System.out.println(" ");
        library.findBooksByAuthor("Author1");
        System.out.println(" ");
        library.borrowBook("Book2");
        System.out.println(" ");
        library.returnBook(book);
        System.out.println(" ");
        library.returnBook(book2);
        System.out.println(" ");
        library.isBookAvailable("Book3");
    }
}
