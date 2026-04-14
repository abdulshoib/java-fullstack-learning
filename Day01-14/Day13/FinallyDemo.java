
public class FinallyDemo {

    public static void main(String[] args) {

        try {
            int num = 10 / 0;
        } catch (Exception e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("This always runs");
        }
    }
}
