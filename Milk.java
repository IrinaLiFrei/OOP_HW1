package OOP_HW1;

public class Milk extends Drink{
    Double fatPercentage;

    public Milk(String name, Double price, Integer quantity, String measure, Double volume, Double fatPercentage){
        super(name, price, quantity, measure, volume);
        this.fatPercentage = fatPercentage;
}
@Override
public String toString() {
    return "Product: " + name + 
        ", price: " + price + 
        ", quantity: " + quantity + 
        ", unit: " + measure + 
        ", volume: " + volume +
        ", fat content: " + fatPercentage;
}
}
