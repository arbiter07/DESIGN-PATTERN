package pattern.strategy;

class NormalDrive implements DriveStrategy {
  @Override
  public void drive() {
      System.out.println("Driving normally...");
  }
}