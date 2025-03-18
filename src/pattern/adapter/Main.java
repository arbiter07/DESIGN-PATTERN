package pattern.adapter;

public class Main {
  public static void main(String[] args) {
    // USB-C 스마트폰 생성
    USB_C usbCPhone = new USB_CPhone();

    // USB-C 스마트폰을 Micro USB 충전기로 충전하기 위해 어댑터 사용
    MicroUSB adapter = new USB_CToMicroUSBAdapter(usbCPhone);

    // 어댑터를 통해 Micro USB 충전기로 충전
    adapter.chargeWithMicroUSB();
}
}
