import maths.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız: ");

         String isim = scanner.nextLine();
        System.out.println("Merhaba " + isim);

        FourOperations fourOperations = new FourOperations();
        fourOperations.sum(2,3);

        Logarithm logarithm = new Logarithm();
    }
}