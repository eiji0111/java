public class Main {
  public static void main(String[] args) throws Exception {
    Hero hero1 = new Hero("ティーダ", 100);
    System.out.println("HP：" + hero1.getHp());
    System.out.println(hero1.getName() + "を召喚した！");

    Wand wand1 = new Wand("炎の杖", 20.0);
    Wizard wizard1 = new Wizard("ユウナ", 80, 60, wand1);

    wizard1.heal(hero1);

    System.out.println(hero1.getName() + "はHPが" + hero1.getHp() + "になった！");
  }
}