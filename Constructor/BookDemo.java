
class Book {

    int bookId;
    String bookName;

    // parameterized constructor
    Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    // default constructor
    Book() {
    }

    void display() {
        System.out.println("Book Id: " + bookId);
        System.out.println("Book Name: " + bookName);
    }
}

public class BookDemo {

    public static void main(String[] args) {
        Book b1 = new Book(101, "java");
        b1.display();

        Book b2 = new Book();
        b2.display();
    }
}
