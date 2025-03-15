package pattern.builder;

class Burger {
  private final String bun;      // 빵
  private final String patty;    // 패티
  private final boolean cheese;  // 치즈 추가 여부
  private final String sauce;    // 소스
  private final String toppings; // 추가 토핑

  // private 생성자 (직접 생성 불가, 오직 빌더를 통해서만 생성 가능)
  private Burger(BurgerBuilder builder) {
      this.bun = builder.bun;
      this.patty = builder.patty;
      this.cheese = builder.cheese;
      this.sauce = builder.sauce;
      this.toppings = builder.toppings;
  }

  // 햄버거 정보 출력
  public void showBurger() {
      System.out.println("🍔 Your Burger:");
      System.out.println("Bun: " + bun);
      System.out.println("Patty: " + patty);
      System.out.println("Cheese: " + (cheese ? "Yes" : "No"));
      System.out.println("Sauce: " + sauce);
      System.out.println("Toppings: " + toppings);
  }

  // 빌더 클래스 (정적 내부 클래스)
  public static class BurgerBuilder {
      private String bun;
      private String patty;
      private boolean cheese;
      private String sauce;
      private String toppings;

      public BurgerBuilder setBun(String bun) {
          this.bun = bun;
          return this;
      }

      public BurgerBuilder setPatty(String patty) {
          this.patty = patty;
          return this;
      }

      public BurgerBuilder setCheese(boolean cheese) {
          this.cheese = cheese;
          return this;
      }

      public BurgerBuilder setSauce(String sauce) {
          this.sauce = sauce;
          return this;
      }

      public BurgerBuilder setToppings(String toppings) {
          this.toppings = toppings;
          return this;
      }

      public Burger build() {
          return new Burger(this);
      }
  }
}
