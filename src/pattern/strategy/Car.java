package pattern.strategy;

class Car {
  private DriveStrategy driveStrategy;

  public Car(DriveStrategy driveStrategy) {
      this.driveStrategy = driveStrategy;
  }

  public void setDriveStrategy(DriveStrategy driveStrategy) {
      this.driveStrategy = driveStrategy;
  }

  public void drive() {
      driveStrategy.drive();
  }
}