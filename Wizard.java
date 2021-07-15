public class Wizard {
  String name;
  int hp = 100;
  static String job = "魔法使い";

  void heal(Hero h) {
    h.hp += 10;
    System.out.println(h.name + "はHPが10回復した！");
  }
}
