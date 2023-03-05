package OOP_HW1;

public class Main {
    public static void main(String[] args) {
        Product bread = new Bread("Rye Bread", 3.5, 60, "pc", "10.10.2010", "prime");
        Product diaper = new Diaper("Pampers", 20.00, 20, "pc", 0, "hypoallergic", 1, 5, 10, "disposable");
        Product egg = new Eggs("My Farm Eggs", 7.20, 20, "package", "10.10.2020", 10);
        Product limonade = new Limonade("Buratino", 4.70, 27, "bottle", 1.00);
        Product mask = new Mask("Pearl", 5.5, 30, "pc", 10);
        Product milk = new Milk("My Farm Milk", 6.00, 10, "package", 1.00, 3.4);
        Product toiPaper = new ToiletPaper("Soft Dream", 11.30, 12, "package", 6, 2);
        Product pacifier = new Pacifier("Happy Baby", 5.10, 15, "pc", 1, "hypoallergic");


        Program.printProduct(bread);
        Program.printProduct(diaper);
        Program.printProduct(egg);
        Program.printProduct(limonade);
        Program.printProduct(mask);
        Program.printProduct(milk);
        Program.printProduct(toiPaper);
        Program.printProduct(pacifier);

    }
    

}
