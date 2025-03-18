package pattern.decorator;

public class Main {
  public static void main(String[] args) {
    Coffee coffee = new SimpleCoffee(); // 기본 커피
    System.out.println(coffee.getDescription() + " Cost: " + coffee.cost());

    coffee = new MilkDecorator(coffee); // 우유 추가
    System.out.println(coffee.getDescription() + " Cost: " + coffee.cost());

    coffee = new SugarDecorator(coffee); // 설탕 추가
    System.out.println(coffee.getDescription() + " Cost: " + coffee.cost());
}

}
