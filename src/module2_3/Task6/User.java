package module2_3.Task6;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowerdBooks;

    public User(String name, int age, ArrayList borrowerdBooks) {
        this.name = name;
        this.age = age;
        this.borrowerdBooks = new ArrayList<>();
    }

    public void addBook(Book book){
        borrowerdBooks.add(book);
    }
    public void removeBook(Book book) {
        borrowerdBooks.remove(book);
    }

    public void getBorrowerdBooks() {
        for (Book borrowerdBook : borrowerdBooks) {
            System.out.println("Title: " + borrowerdBook.getTitle() + ", Author: " + borrowerdBook.getAuthor()+ ", Publication Year: " + borrowerdBook.getPublicationYear());
        }
    }
}
