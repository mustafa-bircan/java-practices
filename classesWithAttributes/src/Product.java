public class Product {
    //attributes | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //clasların default constructorları vardır.
    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
        System.out.println("Constructor started!!!");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }//productı bu parametreleri verirsem kullaanbilirsin demek.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }
}

//class aynı zamanda attributes barındırır yani özellik property
//public her yerden erişebilir demek.
//c# da default private java da publictir.

//private sadece tanımlandığı blokta geçerlidir yani productın olduğu yerde geçerlidir.
//this içinde bulunduğum class demek