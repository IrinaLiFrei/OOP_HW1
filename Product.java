package OOP_HW1;

public class Product{

    protected String name;
    protected Double price;
    protected Integer quantity;
    protected String measure;


    public Product (String name, Double price, Integer quantity, String measure){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "Product: " + name + 
            ", price: " + price + 
            ", quantity: " + quantity + 
            ", unit: " + measure;
    }

}