package module3_3.Task3.system;

import module3_3.Task3.model.Book;
import module3_3.Task3.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<LibraryMember> members;
    private static int idCounter = 1;

    public Library() {
        this.members = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
    public void addMember(LibraryMember newMember){
        newMember.setId(idCounter++);
        members.add(newMember);
    }
    public void borrowBook(LibraryMember member, Book book) {
        if (!book.isReserved() && !book.isBorrowed()) {
            member.setBorrowedBooks(book);
            book.setBorrowed();
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }
    public void returnBook(LibraryMember member, String title, Book book) {
        if (book.isBorrowed() && member.hasBorrowedBook(title)) {
            member.setBorrowedBooks(book);
            book.setBorrowed();
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not borrowed by this member.");
        }
    }

    public void getMembers() {
        for(LibraryMember member : members){
            System.out.println(member);

        }
    }
    public void getBooks() {
        for(Book book : books){
            System.out.println(book);
        }
    }

    public LibraryMember getMemberById(int id) {
        return members.get(id);
    }
   public Book getBook(String title) {
        for (Book book : books) {
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }
    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            member.setReservedBooks(book);
            book.setReserved();
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }
    public void cancelReservation(LibraryMember member, String title, Book book) {
        if (book.isReserved() && member.hasReservedBook(title)) {
            member.setReservedBooks(book);
            book.setReserved();
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }


}
