package pattern.factory;

public class Factory {
  
  public static Product createProduct(String type) {
    if (type.equalsIgnoreCase("A")) {
        return new ProductA();
    } else if (type.equalsIgnoreCase("B")) {
        return new ProductB();
    }
    throw new IllegalArgumentException("Unknown product type: " + type);
  }

  public static void main(String[] args) {
    Product productA = Factory.createProduct("A");
    productA.use(); // Using Product A

    Product productB = Factory.createProduct("B");
    productB.use(); // Using Product B
}

}
