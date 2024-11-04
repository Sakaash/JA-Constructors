package Inheritance.LibManageSys;

import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private Address address;
    private List<BookItem> borrowedBooks;

    public Member(String memberId, String name, Address address) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
    }

    public void borrowBook(BookItem book) {
        if (book.isAvailable()) {
            book.checkOut();
            borrowedBooks.add(book);
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(BookItem book) {
        if (borrowedBooks.remove(book)) {
            book.checkIn();
        }
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<BookItem> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<BookItem> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    
}

