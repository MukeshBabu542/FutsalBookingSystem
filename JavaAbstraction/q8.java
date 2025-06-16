package taskabstraction;

// 8. You are building a library management system.
// Design an interface named "LibraryItem" with methods:
// getTitle(), getAuthor(), getYear(), isAvailable().

interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

public class q8 {
    public static void main(String[] args) {
        LibraryItem book = new Book("Atomic Habits", "James Clear", 2018, true);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
        System.out.println("Available: " + (book.isAvailable() ? "Yes" : "No"));
    }
}
