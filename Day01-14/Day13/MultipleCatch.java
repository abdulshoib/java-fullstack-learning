
public class MultipleCatch {
    public static void main(String[] args) {

        try {
            int arr[] = new int[3];
            arr[5] = 10; // error

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Error");
        }

        System.out.println("Program ended");
    }
}