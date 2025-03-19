package pattern.bridge;

public class RadioDevice implements Device {
  private boolean on = false;
  private int volume = 30;

  @Override
  public void turnOn() {
      on = true;
      System.out.println("📻 Radio is now ON");
  }

  @Override
  public void turnOff() {
      on = false;
      System.out.println("📻 Radio is now OFF");
  }

  @Override
  public void setVolume(int volume) {
      this.volume = volume;
      System.out.println("📻 Radio Volume set to " + this.volume);
  }

  @Override
  public boolean isEnabled() {
      return on;
  }
}

