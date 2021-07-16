import human.Hero;
import human.SuperHero;
import matango.Matango;
import matango.PoisonMatango;

public class Main {
  public static void main(String[] args) throws Exception {
    Hero hero1 = new Hero("ティーダ", 100);
    System.out.println("HP：" + hero1.getHp());
    System.out.println(hero1.getName() + "を召喚した！");

    Wand wand1 = new Wand("炎の杖", 20.0);
    Wizard wizard1 = new Wizard("ユウナ", 80, 60, wand1);

    wizard1.heal(hero1);

    System.out.println(hero1.getName() + "はHPが" + hero1.getHp() + "になった！");

    SuperHero super_hero1 = new SuperHero();
    System.out.println(super_hero1.getName() + "を召喚した！");

    Matango m1 = new Matango('A');
    PoisonMatango pm1 = new PoisonMatango('B');
    m1.attack(hero1);
    pm1.attack(hero1);
    pm1.attack(hero1);
    pm1.attack(hero1);
    pm1.attack(hero1);
    pm1.attack(hero1);

    System.out.println(pm1.getRemainPoison());
  }
}