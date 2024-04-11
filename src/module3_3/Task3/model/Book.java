package module3_3.Task3.model;

public class Book {
    public boolean isReserved;
    public boolean isBorrowed;
    private String title;
    private String author;
    private String ISBN;

    public Book (String title, String author, String ISBN) {
        this.author = author;
        this.ISBN = ISBN;
        this.title = title;
        this.isReserved = false;
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
        return "Title: " + title + " Author: " + author + " ISBN: " + ISBN + " isReserved: " + isReserved + " isBorrowed: " + isBorrowed;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved() {
        isReserved = !isReserved;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed() {
        isBorrowed = !isBorrowed;
    }
}
