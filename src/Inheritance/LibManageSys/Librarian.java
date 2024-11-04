package Inheritance.LibManageSys;

public class Librarian extends Member {

    public Librarian(String memberId, String name, Address address) {
        super(memberId, name, address);
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
    }

    public void removeBook(Library library, Book book) {
        library.getBooks().remove(book);
    }

    public void registerMember(Library library, Member member) {
        library.registerMember(member);
    }
}

