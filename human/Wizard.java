package human;
import Weapon.Wand;

public class Wizard {
  private String name;
  private int hp;
  private int mp;
  private Wand wand;

  // getterメソッド
  public String getName() {
    return this.name;
  }
  public int getHp() {
    return this.hp;
  }
  public int getMp() {
    return this.mp;
  }
  public Wand getWond() {
    return this.wand;
  }
  // setterメソッド
  public void setName(String name) {
    if (name != null && name.length() >= 3) {
      this.name = name;
    } else {
      throw new IllegalArgumentException("エラーメッセージ：不正な値です");
    }
  }
  public void setHp(int hp) {
    if (hp < 0) {
      this.hp = 0;
    } else {
      this.hp = hp;
    }
  }
  public void setMp(int mp) {
    if (this.mp < 0) {
      throw new IllegalArgumentException("エラーメッセージ：不正な値です");
    }
    this.mp = mp;
  }
  public void setWand(Wand wand) {
    if (wand == null) {
      throw new IllegalArgumentException("エラーメッセージ：不正な値です");
    }
    this.wand = wand;
  }

  public void heal(Hero h) {
    int basePoint = 10;
    int recovPoint = (int) (basePoint * this.wand.getPower());

    h.setHp(h.getHp() + recovPoint);
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  }

  public Wizard(String name, int hp, int mp, Wand wand) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
    this.wand = wand;
  }
}
