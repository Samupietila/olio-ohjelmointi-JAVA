package module2_3.Task6;



public class LibraryMain {
    public static void main(String[] args) {
// ALUSTUS
        Library library;
        Book book, book2, book3;
        User user1;
        book2 = new Book("Book2", "Author2", 2002);
        book3 = new Book("Book3", "Author3", 2003);
        book = new Book("Book1", "Author1", 2001);
        user1 = new User("Jaska", 65, null);
        library = new Library();
        book.setRatings(3.2);
        book.setRatings(2.2);
        book.setRatings(5.2);
        book.setRatings(1.2);
        book2.setRatings(3.2);
        book2.setRatings(1.4);
        book2.setRatings(8.8);
        book2.setRatings(5.3);
        book3.addReview("wau");
        book3.addReview("wautsi");
        book3.addReview("wautsiwau");
        book3.addReview("wautsiwauwau");
        book.addReview("surkea");
        book2.addReview("tämä kirja muutti elämäni.");

// TESTAILU
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.getBooks();
        System.out.println(" ");
        library.findBooksByAuthor("Author1");
        System.out.println(" ");
        library.borrowBook("Book2", user1);
        user1.getBorrowerdBooks();
        System.out.println(" ");
        library.returnBook(book, user1);
        user1.getBorrowerdBooks();
        System.out.println(" ");
        library.returnBook(book2, user1);
        user1.getBorrowerdBooks();
        System.out.println(" ");
        library.isBookAvailable("Book3");
        System.out.println();
        library.getAverageBookRating();
        System.out.println();
        library.getMostReviewedBook();
    }
}
