package pattern.prototype;

public class Main {
  public static void main(String[] args) {
    // 원본 객체 생성
    Monster dragon = new Monster("Dragon", 500, 100, 50);
    dragon.addAbility("Fire Breath");
    dragon.addAbility("Flying");

    System.out.println("Original Monster:");
    dragon.showInfo();

    // 깊은 복사로 새로운 객체 생성
    Monster clonedDragon = dragon.clone();
    clonedDragon.addAbility("Ice Breath");

    System.out.println("Cloned Monster (Modified):");
    clonedDragon.showInfo();

    System.out.println("Original Monster (After Cloning):");
    dragon.showInfo();
  }

}
