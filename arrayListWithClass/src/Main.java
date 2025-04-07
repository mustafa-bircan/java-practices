import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer mustafa =new Customer(1,"Mustafa","Bircan");
        customers.add(mustafa);
        customers.add(new Customer(2,"Derin","Yılmaz"));
        customers.add(new Customer(3,"Deniz","Yılmaz"));

        customers.remove(mustafa);

        for (Customer customer:customers) {
            System.out.println(customer.firstName);
        }
    }
}