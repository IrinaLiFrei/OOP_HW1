package OOP_HW1;

public class Food extends Product{
    protected String expDate;
   
    public Food(String name, Double price, Integer quantity, String measure, String expDate) {
        super(name, price, quantity, measure);
        this.expDate = expDate;
    }
    @Override
    public String toString() {
        return "Product: " + name + 
        ", price: " + price + 
        ", quantity: " + quantity + 
        ", unit: " + measure + 
        ", expiry date: " + expDate;
    }
}
