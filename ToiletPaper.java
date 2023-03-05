package OOP_HW1;

public class ToiletPaper extends Hygiene {
    Integer layer;

    public ToiletPaper(String name, Double price, Integer quantity, String measure, Integer numOfPieces, Integer layer) {
        super(name, price, quantity, measure, numOfPieces);
        this.layer = layer;
    }
    @Override
    public String toString() {
        return "Product: " + name + 
        ", price: " + price + 
        ", quantity: " + quantity + 
        ", unit: " + measure + 
        ", number of pieces: " + numOfPieces +
        ", number of layers: " + layer;
    }
}
