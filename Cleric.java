public class Cleric {
  String name;
  int hp;
  int mp;
  static final int MAX_HP = 50;
  static final int MAX_MP = 10;

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
