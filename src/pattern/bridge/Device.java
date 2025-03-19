package pattern.bridge;

// 구현 계층 (Implementation)
public interface Device {
  void turnOn();
  void turnOff();
  void setVolume(int volume);
  boolean isEnabled();
}
