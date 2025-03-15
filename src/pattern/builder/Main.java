package pattern.builder;

public class Main {
  public static void main(String[] args) {
    // 빌더 패턴을 사용해 햄버거 만들기 Lombok 대체 가능
    Burger burger = new Burger.BurgerBuilder()
            .setBun("Sesame Bun")
            .setPatty("Beef Patty")
            .setCheese(true)
            .setSauce("BBQ Sauce")
            .setToppings("Lettuce, Tomato, Pickles")
            .build();

    burger.showBurger();
  }

}
