
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("sample.txt");

            fw.write("Hello, this is my first file handling program!");

            fw.close();

            System.out.println("Data written successfully");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}
