package pattern.proxy;

public class Main {
  public static void main(String[] args) {
      Image image1 = new ProxyImage("photo1.jpg");
      Image image2 = new ProxyImage("photo2.jpg");

      // 첫 번째 호출 -> 이미지 로드 후 표시
      image1.display();
      System.out.println("");

      // 두 번째 호출 -> 캐싱된 객체 사용
      image1.display();
      System.out.println("");

      // 다른 이미지 호출 -> 새로 로드
      image2.display();
  }
}
