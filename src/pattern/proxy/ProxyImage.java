package pattern.proxy;

// Proxy: 프록시 클래스 (지연 로딩 적용)
public class ProxyImage implements Image {
  private RealImage realImage;
  private String fileName;

  public ProxyImage(String fileName) {
      this.fileName = fileName;
  }

  @Override
  public void display() {
      if (realImage == null) {
          realImage = new RealImage(fileName);  // 실제 객체를 필요할 때만 생성
      }
      realImage.display();
  }
}
