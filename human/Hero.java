package human;
public class Hero {
  private String name;
  private int hp;

  public String getName() {
    return this.name;
  }
  public int getHp() {
    return this.hp;
  }
  public void setHp(int hp) {
    this.hp = hp;
  }
  public Hero(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }
}
