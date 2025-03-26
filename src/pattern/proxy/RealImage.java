package pattern.proxy;

// RealSubject: 실제 이미지 객체 (비싼 연산 수행)
public class RealImage implements Image {
  private String fileName;

  public RealImage(String fileName) {
      this.fileName = fileName;
      loadFromDisk();  // 실제 이미지 로딩 (비용이 큼)
  }

  private void loadFromDisk() {
      System.out.println("[로딩] 이미지 파일: " + fileName);
  }

  @Override
  public void display() {
      System.out.println("[표시] 이미지: " + fileName);
  }
}
