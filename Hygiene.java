package OOP_HW1;

public class Hygiene extends Product{
    
    protected Integer numOfPieces;
    
    public Hygiene(String name, Double price, Integer quantity, String measure,  Integer numOfPieces) {
        super(name, price, quantity, measure);
        this.numOfPieces = numOfPieces;
    }
    @Override
    public String toString() {
        return "Product: " + name + 
        ", price: " + price + 
        ", quantity: " + quantity + 
        ", unit: " + measure + 
        ", number of pieces: " + numOfPieces;
    }
}
