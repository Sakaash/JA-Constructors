package Inheritance.LibManageSys;

import java.util.Date;

public class BookItem extends Book {
    private String barcode;
    private boolean isAvailable;
    private Date dueDate;

    public BookItem(String title, String author, String ISBN, Date publicationDate, String barcode) {
        super(title, author, ISBN, publicationDate);
        this.barcode = barcode;
        this.isAvailable = true;
    }

    public void checkOut() {
        isAvailable = false;
    }

    public void checkIn() {
        isAvailable = true;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    
}

