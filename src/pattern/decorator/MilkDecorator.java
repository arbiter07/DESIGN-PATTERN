package pattern.decorator;

public class MilkDecorator extends CoffeeDecorator {
    
  public MilkDecorator(Coffee coffee) {
      super(coffee);
  }

  @Override
  public String getDescription() {
      return decoratedCoffee.getDescription() + ", Milk";
  }

  @Override
  public double cost() {
      return decoratedCoffee.cost() + 1.5;
  }
}