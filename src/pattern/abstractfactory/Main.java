package pattern.abstractfactory;

public class Main {
  public static void main(String[] args) {
    // 현재 UI 테마를 결정
    GUIFactory factory;

    String theme = "dark"; // "light" 또는 "dark" (조건에 따라 결정됨)

    if (theme.equalsIgnoreCase("light")) {
        factory = new LightThemeFactory();
    } else {
        factory = new DarkThemeFactory();
    }

    // 팩토리를 통해 버튼과 체크박스 생성
    Button button = factory.createButton();
    Checkbox checkbox = factory.createCheckbox();

    button.render();  // 다크 테마 버튼 렌더링
    checkbox.check(); // 다크 테마 체크박스 체크
}

}
