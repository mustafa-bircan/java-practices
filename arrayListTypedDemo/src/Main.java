import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("İzmir");
        cities.add("Eskişehir");
        cities.add("Bursa");
        cities.add("Aydın");

        cities.remove("İstanbul");
        Collections.sort(cities);
        for (String city:cities) {
            System.out.println(city);
        }
    }
}