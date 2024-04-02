package module2_3.Task1;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void getBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + 1 + ". Title: \"" + books.get(i).getTitle() + "\", Author: \"" + books.get(i).getAuthor() + "\", Year: " + books.get(i).getPublicationYear());
        }
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by Author '" + author + "':");
        for (Book book : books) {
            if (author.equals(book.getAuthor())) {
                System.out.println("Title: \"" + book.getTitle() + "\", Year: " + book.getPublicationYear());
            }
        }
    }
}

