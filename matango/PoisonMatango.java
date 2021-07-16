package matango;
import human.Hero;

public class PoisonMatango extends Matango {
  private int remainPoison = 5;

  public PoisonMatango(char suffix) {
    super(suffix);
  }

  public void attack(Hero h) {
    super.attack(h);
    if (remainPoison > 0) {
      System.out.println("さらにお化け毒キノコは毒胞子をばらまいた！");
      int poisondamage = h.getHp() / 5;
      h.setHp(h.getHp() - poisondamage);
      System.out.println(h.getName() + "は、" + poisondamage + "ポイントのダメージを受けた！");
      remainPoison --;
    }
  }
  public int getRemainPoison() {
    return this.remainPoison;
  }
}
