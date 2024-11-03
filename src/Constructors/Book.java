package Constructors;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int price;

    private static int bookCounter = 0;

    private static ArrayList<Book> books = new ArrayList<>();

    public Book(String title, String author, int price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        bookCounter++;
        books.add(this);
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if (title == null || title.isEmpty())
            throw new NullPointerException("Title cannot be empty");
        else
            this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        if (author == null || author.isEmpty())
            throw new NullPointerException("Author cannot be empty");
        else
            this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        if (price < 0)
            throw new IllegalArgumentException("Price cannot be negative");
        else
            this.price = price;
    }

    public static int getBookCounter() {
        return bookCounter;
    }

    public static void printAllBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle()+" "+book.getAuthor());
        }
    }
}
class Main {
    public static void main(String[] args) {
        new Book("Book 1", "John Doe", 500);
        new Book("Book 2", "Aunt May", 600);
        new Book("Book 3", "Tom Hanks", 700);
        Book.printAllBooks();

        System.out.println();

        new Employee("John Doe", 50000, "johndoe1984@gmail.com", "100");
        new Employee("Malar", 92493, "malar1996@gmail.com", "101");
        new Employee("Saran K", 50000, "internsaran2003@gmail.com", "102");
        Employee.printAllEmployees();

        System.out.println();

        new Movie("Neram","2013","Alphonse Puthren", 8.40);
        new Movie("Imaikkaa Nodigal","2018","Ajay Gnanamuthu", 8.13);
        new Movie("Maharaja","2024","Nithilan Saminathan", 9.26);
        Movie.printAllMovies();
    }
}


