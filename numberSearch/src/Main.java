public class Main {
    public static void main(String[] args) {
        int[] numbers = new int [] {1,2,5,7,9,0};
        int aranacak = 23;

        boolean isThere = false;
        for (int number:numbers) {
            if (number == aranacak) {
                isThere = true;
                break;
            }
        }

        if (isThere) {
            System.out.println("Sayı mevcuttur");
        } else {
            System.out.println("Sayı yoktur");
        }
    }
}