package module2_3.Task5;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isBorrowed;
    private ArrayList ratings;
    private ArrayList reviews;


    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
        this.ratings = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return  publicationYear;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed() {
        isBorrowed = !isBorrowed;
    }

    public void setRatings(double rating){
        ratings.add(rating);
    }

    public ArrayList getRatings() {
        return ratings;
    }
    public void addReview(String review){
        reviews.add(review);
    }

    public ArrayList getReviews() {
        return reviews;
    }
}
