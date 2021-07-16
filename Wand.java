public class Wand {
  private String name;
  private double power;

  // getterメソッド
  public String getName() {
    return this.name;
  }
  public double getPower() {
    return this.power;
  }
  // setterメソッド
  public void setName(String name) {
    if (name != null) {
      this.name = name;
    } else {
      throw new IllegalArgumentException("エラーメッセージ：不正な値です");
    }
  }
  public void setPower(double power) {
    if (power >= 0.5 && power <= 100.0) {
      this.power = power;
    } else {
      throw new IllegalArgumentException("エラーメッセージ：不正な値です");
    }
  }
  Wand(String name, double power) {
    this.name = name;
    this.power = power;
  }
}
