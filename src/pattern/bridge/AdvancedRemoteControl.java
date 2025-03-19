package pattern.bridge;

// 확장된 추상 계층 (Refined Abstraction)
public class AdvancedRemoteControl extends RemoteControl {
  public AdvancedRemoteControl(Device device) {
      super(device);
  }

  public void mute() {
      System.out.println("🔇 Muting device...");
      device.setVolume(0);
  }
}
