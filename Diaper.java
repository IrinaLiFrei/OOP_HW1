package OOP_HW1;

public class Diaper extends Children {
    Integer size;
    Integer minWeight;
    Integer maxWeight;
    String type;

public Diaper(String name, Double price, Integer quantity, String measure, Integer minAge, String hypoallergic, Integer size, Integer minWeight,  Integer maxWeight, String type){
        super(name, price, quantity, measure, minAge, hypoallergic);
        this.size = size;
        this.maxWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product: " + name + 
        ", price: " + price + 
        ", quantity: " + quantity + 
        ", unit: " + measure + 
        ", min. age: " + minAge +
        ", hypoallergenicity: " + hypoallergic +
        ", size: " + size +
        ", minimum weight: " + minWeight +
        ", maximum weight: " + maxWeight +
        ", type: " + type;
    }
}
