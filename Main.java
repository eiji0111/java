import Weapon.Wand;
import human.Hero;
import human.SuperHero;
import human.Wizard;
import matango.Matango;
import matango.PoisonMatango;

import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
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

    Calendar c = Calendar.getInstance();
    // ※ Monthは、1月が0、12月が11となる
    c.set(2018, 7, 21, 17, 45, 50);
    Date past = c.getTime();
    System.out.println(past);

    int i1 = 10;
    Integer i2 = i1;
    int i3 = i2;
    System.out.println(i3);

    Date now = new Date();
    Calendar today = Calendar.getInstance();
    today.setTime(now);
    int day = today.get(Calendar.DAY_OF_MONTH);
    today.set(Calendar.DAY_OF_MONTH, day + 100);
    Date after100days = today.getTime();
    SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
    String s = f.format(after100days);
    System.out.println(s);

    BankAccounts a = new BankAccounts("4649", 1592);
    System.out.println(a);
    BankAccounts b = new BankAccounts("4649", 3000);
    System.out.println(a.getAccountNumber().equals(b.getAccountNumber()));

    try {
      String str = null;
      System.out.println(str.length());
    } catch (NullPointerException e) {
      System.out.println("NullPointerException例外をcatchしました");
      System.out.println("ーースタックトレース（ここから）ーー");
      e.getStackTrace();
      System.out.println("ーースタックトレース（ここまで）ーー");
    }

    try {
      int i = Integer.parseInt("あ");
    } catch (NumberFormatException e) {
      System.out.println("エラーメッセージ：" + e.getMessage());
    }
  }
}