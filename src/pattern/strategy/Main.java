package pattern.strategy;

public class Main {

  public static void main(String[] args) {
    Car myCar = new Car(new NormalDrive()); // 일반 주행 모드
    myCar.drive(); // "Driving normally..." 출력

    myCar.setDriveStrategy(new SportsDrive()); // 스포츠 주행 모드 변경
    myCar.drive(); // "Driving in sports mode..." 출력
  }

}
