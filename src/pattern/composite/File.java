package pattern.composite;

// Leaf (단일 객체)
public class File implements FileSystemComponent {
  private String name;

  public File(String name) {
      this.name = name;
  }

  @Override
  public void showDetails() {
      System.out.println("📄 File: " + name);
  }
}
