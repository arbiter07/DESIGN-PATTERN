package pattern.bridge;

// 추상 계층 (Abstraction)
public class RemoteControl {
  protected Device device;

  public RemoteControl(Device device) {
      this.device = device;
  }

  public void togglePower() {
      if (device.isEnabled()) {
          device.turnOff();
      } else {
          device.turnOn();
      }
  }

  public void volumeUp() {
      System.out.println("🔼 Increasing volume...");
      device.setVolume(100);
  }
}

