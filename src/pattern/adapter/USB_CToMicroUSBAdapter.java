package pattern.adapter;

class USB_CToMicroUSBAdapter implements MicroUSB {
  private USB_C device;

  public USB_CToMicroUSBAdapter(USB_C device) {
      this.device = device;
  }

  @Override
  public void chargeWithMicroUSB() {
      System.out.println("Adapter converts Micro USB to USB-C...");
      device.chargeWithUSB_C(); // USB-C 방식으로 충전
  }
}