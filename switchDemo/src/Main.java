import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen notunuzu girin (0-100 arasında): ");
        int not = scanner.nextInt();

        char harfNotu;

        switch (not / 10) {
            case 10:
            case 9:
                harfNotu = 'A';
                break;
            case 8:
                harfNotu = 'B';
                break;
            case 7:
                harfNotu = 'C';
                break;
            case 6:
                harfNotu = 'D';
                break;
            case 5:
            case 4:
                harfNotu = 'E';
                break;
            default:
                harfNotu = 'F';
                break;
        }

        System.out.println("Aldığınız notun harf karşılığı: " + harfNotu);
    }
}
