public class Cleric {
  private String name;
  private int hp;
  private int mp;
  static final int MAX_HP = 50;
  static final int MAX_MP = 10;

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getHp() {
    return this.hp;
  }
  public int getMp() {
    return this.mp;
  }
  public Cleric(String name, int hp, int mp) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }
  public Cleric(String name, int hp) {
    this(name, hp, Cleric.MAX_MP);
  }
  public Cleric(String name) {
    this(name, Cleric.MAX_HP);
  }
}
