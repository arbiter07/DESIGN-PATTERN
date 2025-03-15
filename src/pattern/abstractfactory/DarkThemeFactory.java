package pattern.abstractfactory;

public class DarkThemeFactory implements GUIFactory {
  public Button createButton() {
      return new DarkButton();
  }

  public Checkbox createCheckbox() {
      return new DarkCheckbox();
  }
}