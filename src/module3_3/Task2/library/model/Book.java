package module3_3.Task2.library.model;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public boolean isBorrowed;

    public Book (String title, String author, String ISBN) {
        this.author = author;
        this.ISBN = ISBN;
        this.title = title;
        this.isBorrowed = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }
    public String toString(){
        return "Title: " + title + " Author: " + author + " ISBN: " + ISBN + " isBorrowed: " + isBorrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed() {
        isBorrowed = !isBorrowed;
    }
}
