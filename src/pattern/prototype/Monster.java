package pattern.prototype;
import java.util.ArrayList;
import java.util.List;

public class Monster implements Cloneable {
  private String type;
  private int health;
  private int attack;
  private int defense;
  private List<String> abilities; // 참조 타입(Reference Type) 필드 추가

  public Monster(String type, int health, int attack, int defense) {
      this.type = type;
      this.health = health;
      this.attack = attack;
      this.defense = defense;
      this.abilities = new ArrayList<>();
  }

  public void addAbility(String ability) {
      abilities.add(ability);
  }

  // 깊은 복사 메서드 (Deep Copy)
  @Override
  public Monster clone() {
      try {
        Monster cloned = (Monster) super.clone();
          cloned.abilities = new ArrayList<>(this.abilities); // 리스트도 복제
          return cloned;
      } catch (CloneNotSupportedException e) {
          throw new RuntimeException("Clone failed");
      }
  }

  public void showInfo() {
      System.out.println("Monster Type: " + type);
      System.out.println("Health: " + health);
      System.out.println("Attack: " + attack);
      System.out.println("Defense: " + defense);
      System.out.println("Abilities: " + abilities);
      System.out.println("---------------------------");
  }
}