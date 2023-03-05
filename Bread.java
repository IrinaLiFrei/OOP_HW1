package OOP_HW1;

public class Bread extends Food {
    String floar;

    public Bread(String name, Double price, Integer quantity, String measure, String expDate, String floar) {
        super(name, price, quantity, measure, expDate);
        this.floar = floar;
    }
    @Override
    public String toString() {
        return "Product: " + name + 
        ", price: " + price + 
        ", quantity: " + quantity + 
        ", unit: " + measure + 
        ", expiry date: " + expDate +
        ", floar type: " + floar;
    }
}
