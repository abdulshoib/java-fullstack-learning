
// Custom Exception
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class BankDemo {

    public static void main(String[] args) {

        int balance = 500;
        int withdraw = 1000;

        try {
            if (withdraw > balance) {
                throw new InsufficientBalanceException("Insufficient Balance");
            } else {
                System.out.println("Transaction Successful");
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
