package module3_3.Task3.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {

    private int id;
    private String name;
    private List<Book> borrowedBooks;
    private List<Book> reservedBooks;

    public LibraryMember(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public boolean hasBorrowedBook(String title) {
        for (Book book : borrowedBooks) {
            if(book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
    public boolean hasReservedBook(String title) {
        for (Book book : reservedBooks) {
            if(book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBorrowedBooks(Book book) {
        if(borrowedBooks.contains(book)){
            this.borrowedBooks.remove(book);
        } else {
            this.borrowedBooks.add(book);
        }
    }

    public void setReservedBooks(Book book) {
        if(reservedBooks.contains(book)){
            this.reservedBooks.remove(book);
        } else {
            this.reservedBooks.add(book);
        }
    }
    public void printBorrowed(){
        System.out.println("-");
        System.out.println("Books borrowed by " + name);
        System.out.println("ID: " + id);
        if (!borrowedBooks.isEmpty()) {
            for (Book book : borrowedBooks) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN " + book.getISBN());
                System.out.println();
            }
        }else {
            System.out.println("No borrowed books.");
        }
        System.out.println("-");
    }
    public void printReserved(){
        System.out.println("-");
        System.out.println("Books reserved by " + name);
        System.out.println("ID: " + id);
        if (!reservedBooks.isEmpty()) {
            for (Book book : reservedBooks) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN " + book.getISBN());
                System.out.println();
            }
        }else {
            System.out.println("No reserved books.");
        }
        System.out.println("-");
    }
    public String toString(){
        return "Name: " + name + " ID: " + id;
    }

}
