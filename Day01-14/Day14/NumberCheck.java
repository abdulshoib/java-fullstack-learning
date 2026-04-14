
public class NumberCheck {

    static void checkNumber(int num) throws Exception {
        if (num < 0) {
            throw new Exception("Negative number not allowed");
        } else {
            System.out.println("Valid number");
        }
    }

    public static void main(String[] args) {

        try {
            checkNumber(-10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
