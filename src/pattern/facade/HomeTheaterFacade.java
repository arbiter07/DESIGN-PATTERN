package pattern.facade;

// Facade 클래스
public class HomeTheaterFacade {
  private Amplifier amplifier;
  private DVDPlayer dvdPlayer;
  private Projector projector;

  public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector) {
      this.amplifier = amplifier;
      this.dvdPlayer = dvdPlayer;
      this.projector = projector;
  }

  public void watchMovie(String movie) {
      System.out.println("\n🎥 준비 중... 영화 감상을 시작합니다!");
      amplifier.on();
      projector.on();
      dvdPlayer.on();
      dvdPlayer.play(movie);
  }

  public void endMovie() {
      System.out.println("\n🎬 영화 종료... 시스템을 종료합니다.");
      dvdPlayer.off();
      projector.off();
      amplifier.off();
  }
}
