package pattern.strategy;

class SportsDrive implements DriveStrategy {
  @Override
  public void drive() {
      System.out.println("Driving in sports mode...");
  }
}