package pattern.bridge;

public class Main {
  public static void main(String[] args) {
      Device tv = new TvDevice();
      RemoteControl remote = new RemoteControl(tv);

      remote.togglePower();
      remote.volumeUp();

      System.out.println("------");

      Device radio = new RadioDevice();
      AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(radio);

      advancedRemote.togglePower();
      advancedRemote.mute();
  }
}
