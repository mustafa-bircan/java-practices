public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Lenovo Laptop", 3000, 2, "black"); //product constructor default

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

    }
}