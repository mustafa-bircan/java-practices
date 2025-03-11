public class Main {
    public static void main(String[] args) {
        numberSearch();
    }
    public static  void numberSearch() {
        int[] sayilar = new int [] {1,2,5,7,9,0};

        int aranacak = 0;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            messageGive("Sayı mevcuttur.." + aranacak);
        } else {
            messageGive("Sayı mevcut değildir.." + aranacak);
        }
    }
    public static void messageGive(String mesaj){
        System.out.println(mesaj);
    }
}
