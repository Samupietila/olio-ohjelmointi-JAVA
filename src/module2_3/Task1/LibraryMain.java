package module2_3.Task1;

public class LibraryMain {
    public static void main(String[] args) {
        Book book, book2, book3;
        Library library;

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
    }
}
