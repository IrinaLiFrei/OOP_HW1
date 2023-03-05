package OOP_HW1;

public class Drink extends Product{

    protected Double volume;

    public Drink(String name, Double price, Integer quantity, String measure, Double volume) {
        super(name, price, quantity, measure);
        this.volume = volume;

    }

    @Override
    public String toString() {
        return "Product: " + name + 
        ", price: " + price + 
        ", quantity: " + quantity + 
        ", unit: " + measure + 
        ", volume: " + volume;
    }
}
