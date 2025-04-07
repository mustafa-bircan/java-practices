import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
             reader = new BufferedReader(
                    new FileReader("C:\\Users\\msbrt\\java-practices\\readingFileDemo\\src\\numbers.txt")
            );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                reader.close();
            }catch (Exception e) {

            }

        }
    }
}