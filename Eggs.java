package OOP_HW1;

public class Eggs extends Food {
    Integer numInPack;

    public Eggs(String name, Double price, Integer quantity, String measure, String expDate, Integer numInPack) {
        super(name, price, quantity, measure, expDate);
        this.numInPack = numInPack;
    }
    @Override
    public String toString() {
        return "Product: " + name + 
        ", price: " + price + 
        ", quantity: " + quantity + 
        ", unit: " + measure + 
        ", expiry date: " + expDate +
        ", package quantity: " + numInPack;
    }
}
