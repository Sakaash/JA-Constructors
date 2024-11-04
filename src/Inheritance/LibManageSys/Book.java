package Inheritance.LibManageSys;

import java.util.Date;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private Date publicationDate;
    private BookItem bookItem;

    public Book(String title, String author, String ISBN, Date publicationDate) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public BookItem getBookItem() {
        return bookItem;
    }

    public void setBookItem(BookItem bookItem) {
        this.bookItem = bookItem;
    }
    
}

