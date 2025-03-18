package pattern.adapter;

class USB_CPhone implements USB_C {
  @Override
  public void chargeWithUSB_C() {
      System.out.println("Charging phone with USB-C...");
  }
}