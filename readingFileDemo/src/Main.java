import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args)  {
        BufferedReader reader = null;
        int total = 0;
        try {
             reader = new BufferedReader(
                    new FileReader("C:\\Users\\msbrt\\java-practices\\readingFileDemo\\src\\numbers.txt"));

                     String line = null;
                     while ((line = reader.readLine()) != null) {
                            total += Integer.valueOf(line);
                     }
            System.out.println("Toplam= " + total);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            }catch (Exception e) {

            }

        }
    }
}