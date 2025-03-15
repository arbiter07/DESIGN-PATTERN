package pattern.factory;

public class Main {
  public static void main(String[] args) {
    Product productA = Factory.createProduct("A");
    productA.use(); // Using Product A

    Product productB = Factory.createProduct("B");
    productB.use(); // Using Product B
  }
}
