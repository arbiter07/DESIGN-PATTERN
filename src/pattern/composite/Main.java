package pattern.composite;

public class Main {
  public static void main(String[] args) {
      // 파일 객체 생성
      File file1 = new File("document.txt");
      File file2 = new File("image.png");
      File file3 = new File("video.mp4");

      // 폴더 객체 생성
      Folder folder1 = new Folder("My Documents");
      Folder folder2 = new Folder("Media Files");

      // 폴더에 파일 추가
      folder1.addComponent(file1);
      folder2.addComponent(file2);
      folder2.addComponent(file3);

      // 최상위 폴더 생성
      Folder rootFolder = new Folder("Root");
      rootFolder.addComponent(folder1);
      rootFolder.addComponent(folder2);

      // 파일 시스템 출력
      rootFolder.showDetails();
  }
}

