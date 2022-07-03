import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file {

    public static void main(String[] args) {
        try {
            FileWriter f1 = new FileWriter("C:fileoper.txt");
            f1.write("hey world");
            f1.close();
            System.out.println("written");

        } catch (IOException e) {
            System.out.println("unexpected error occurred");
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
