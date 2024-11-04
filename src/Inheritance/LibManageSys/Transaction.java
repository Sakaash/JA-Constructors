package Inheritance.LibManageSys;

import java.util.Date;

public class Transaction {
    private String transactionId;
    private Date dateOfTransaction;
    private Member member;
    private BookItem bookItem;
    private TransactionType type;

    public Transaction(String transactionId, Member member, BookItem bookItem, TransactionType type) {
        this.transactionId = transactionId;
        this.member = member;
        this.bookItem = bookItem;
        this.type = type;
        this.dateOfTransaction = new Date();
    }

    public enum TransactionType {
        ISSUE, RETURN
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(Date dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public BookItem getBookItem() {
        return bookItem;
    }

    public void setBookItem(BookItem bookItem) {
        this.bookItem = bookItem;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
    
}

