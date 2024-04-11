package module3_3.Task2.library;

import module3_3.Task2.library.model.Book;
import module3_3.Task2.library.model.LibraryMember;
import module3_3.Task2.library.system.Library;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main started");
        Library library = new Library();
        for (int i = 1; i < 6; i++) {
            LibraryMember member = new LibraryMember("kayttaja"+ i );
            library.addMember(member);
        }
        for (int i = 1; i < 27; i++) {
            library.addBook(new Book("Iijoki-sarjan " + i + " teos", "Kalle Päätalo", "978-951-858-434-" + i));
        }
        System.out.println("Käyttäjät: ");
        library.getMembers();
        System.out.println("Kirjat: ");
        library.getBooks();

        for (int i = 1; i < 6; i++) {
            library.getMemberById(1).setBorrowedBooks(library.getBook("Iijoki-sarjan " + i + " teos"));
        }
        library.getMemberById(1).print();
        for (int i = 3; i < 6; i++) {
            library.getMemberById(1).setBorrowedBooks(library.getBook("Iijoki-sarjan " + i + " teos"));
        }
        library.getMemberById(1).print();

    }
}
