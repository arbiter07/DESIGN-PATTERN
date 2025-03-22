package pattern.facade;

public class Main {
  public static void main(String[] args) {
      // 서브시스템 객체 생성
      Amplifier amplifier = new Amplifier();
      DVDPlayer dvdPlayer = new DVDPlayer();
      Projector projector = new Projector();

      // Facade 객체 생성
      HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, projector);

      // 영화 감상 시작
      homeTheater.watchMovie("Interstellar");

      // 영화 종료
      homeTheater.endMovie();
  }
}
