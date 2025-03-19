package pattern.bridge;

// 구체적 구현 (Concrete Implementation)
public class TvDevice implements Device {
  private boolean on = false;
  private int volume = 50;

  @Override
  public void turnOn() {
      on = true;
      System.out.println("📺 TV is now ON");
  }

  @Override
  public void turnOff() {
      on = false;
      System.out.println("📺 TV is now OFF");
  }

  @Override
  public void setVolume(int volume) {
      this.volume = volume;
      System.out.println("📺 TV Volume set to " + this.volume);
  }

  @Override
  public boolean isEnabled() {
      return on;
  }
}
