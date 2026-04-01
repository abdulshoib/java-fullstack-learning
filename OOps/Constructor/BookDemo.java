
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
// if a claass contains it is the responsibility of the programmer to create default constructor in the class

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
/* *
🎯 Key Rules

Constructor name = same as class name 

It has no return type (not even void)
It runs automatically when object is created
Can be overloaded
Cannot be static
*/
