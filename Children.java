package OOP_HW1;

public class Children extends Product{
    protected Integer minAge;
    protected String hypoallergic;


    public Children(String name, Double price, Integer quantity, String measure, Integer minAge, String hypoallergic) {
        super(name, price, quantity, measure);
        this.minAge = minAge;
        this.hypoallergic = hypoallergic;
    }

    @Override
    public String toString() {
        return "Product: " + name + 
        ", price: " + price + 
        ", quantity: " + quantity + 
        ", unit: " + measure + 
        ", min. age: " + minAge +
        ", hypoallergenicity: " + hypoallergic;
    }
}
