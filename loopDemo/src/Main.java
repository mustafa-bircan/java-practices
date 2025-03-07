public class Main {
    public static void main(String[] args) {
        //for
        for (int i = 1; i <=10; i++) {
            System.out.println("i yi yazdırıyoruz : " + i);
        }
        System.out.println("Döngü Bitii");

        for (int i = 1; i <=10; i+=2) {
            System.out.println("i yi ama tek sayıları yazdırıyoruz : " + i);
        }
        System.out.println("Döngü Bitii");

        for (int i = 0; i <=10; i+=2) {
            System.out.println("i yi ama çift sayıları yazdırıyoruz : " + i);
        }
        System.out.println("Döngü Bitii");
        System.out.println("*********************");


        //while
        int i = 1;
        while(i <10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While Bitii");
        System.out.println("*********************");

        //Do-While
        int j = 1;
        do{
            System.out.println(j);
            j+=3;
        } while (j<10);
        System.out.println("Do-While Bitii");
    }
}