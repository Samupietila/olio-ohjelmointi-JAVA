package module2_3.Task5;


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

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (!book.getIsBorrowed()) {
                    book.setIsBorrowed();
                    System.out.println(title + " is borrowed now.");
                } else {
                    System.out.println(book.getIsBorrowed());
                    System.out.println("Book already borrowed.");
                }
                break;
            }
        }
    }

    public void returnBook(Book book) {
        if (book.getIsBorrowed()) {
            System.out.println(book.getTitle() + " Book returned.");
            book.setIsBorrowed();
        } else {
            System.out.println("Book unable to return, it is not borrowed.");
        }
    }

    public void isBookAvailable(String title) {
        for(Book book : books) {
            if (book.getTitle().equals(title)) {
                if (!book.getIsBorrowed()) {
                    System.out.println("Book is available");
                } else {
                    System.out.println(book.getIsBorrowed());
                    System.out.println("Book already borrowed.");
                }
                break;
            }
        }
    }
    public void getAverageBookRating() {
        double sum = 0;
        int divider = 0;
        for (Book book : books) {
            for (int i = 0; i < book.getRatings().size(); i++) {
                sum += (double) book.getRatings().get(i);
                divider++;
            }
        }
        System.out.println("Average book rating is: " + sum/divider);
    }

    public void getMostReviewedBook() {
        int number = 0;
        String winner = null;
        for (Book book : books) {
            if (book.getReviews().size() > number) {
                winner = book.getTitle();
                number = book.getReviews().size();
            }
        }
        System.out.println("Most revievs has: " + winner);
    }

}

