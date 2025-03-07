public class Main {
    public static void main(String[] args) {
        char harf = 'E';

        switch (harf) {
            case 'A':
            case 'I':
            case '0':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            default:
                System.out.println("İnce Sesli harf");
        }
    }
}