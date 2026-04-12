

// Custom Exception
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class InvalidAgeDemo {

    public static void main(String[] args) {

        int age = 16;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18+");
            } else {
                System.out.println("Valid Age");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
