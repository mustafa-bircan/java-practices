public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel";
        String newMessage = giveCity();
        System.out.println(newMessage);
        int number = sum(5,7);
        System.out.println(number);
    }
    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int sum(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static  String giveCity() {
        return "Ankara";
    }
}

//void yap emrini uygular yani değer döndürmez!!