package module3_3.Task3;

import module3_3.Task3.model.Book;
import module3_3.Task3.model.LibraryMember;
import module3_3.Task3.system.Library;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main started");
        Library library = new Library();
        for (int i = 1; i < 6; i++) {
            LibraryMember member = new LibraryMember("kayttaja"+ i );
            library.addMember(member);
        }
        for (int i = 1; i < 27; i++) {
            library.addBook(new Book("Iijoki-sarjan " + i + ". teos", "Kalle Päätalo", "978-951-858-434-" + i));
        }
        System.out.println("Käyttäjät: ");
        library.getMembers();
        System.out.println("Kirjat: ");
        library.getBooks();

        for (int i = 1; i < 3; i++) {
            library.borrowBook(library.getMemberById(1),library.getBook("Iijoki-sarjan " + i + ". teos"));
        }
        library.getMemberById(1).printBorrowed();
        Book iijoki2 = library.getBook("Iijoki-sarjan 2. teos");
        Book iijoki11 = library.getBook("Iijoki-sarjan 11. teos");
        library.returnBook(library.getMemberById(1), iijoki2.getTitle(), iijoki2 );
        library.getMemberById(1).printBorrowed();

        for (int i = 10; i < 15; i++) {
            library.reserveBook(library.getMemberById(4),library.getBook("Iijoki-sarjan " + i + ". teos"));
        }
        library.getBooks();
        System.out.println(iijoki11.isReserved());
        library.cancelReservation(library.getMemberById(4), iijoki11.getTitle(), iijoki11);
        System.out.println(iijoki11.isReserved());


    }
}
