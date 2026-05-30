package oopinjava;

public class Book {

    static int totalBooks;

    String title;
    String author;
    String  isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn) {
        this("Unknown", "Unknown", isbn);
    }

    { // Object Init
        totalBooks++;
    }

    void borrowBook() {
        if(isBorrowed) {
            System.out.println("Book is already borrowed...");
        }
        else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook() {
        if(isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        }
        else {
            System.out.println("This book is already in the library...");
        }
    }

    static int getTotalBooks() {
        return totalBooks;
    }

    public static void main(String[] args) {
        Book myBook = new Book("1");
        Book designBook = new Book("Design", "Author", "5");
        System.out.println(Book.getTotalBooks());
        designBook.borrowBook();
        myBook.borrowBook();
        designBook.borrowBook();
        designBook.returnBook();
        designBook.returnBook();

    }
}
