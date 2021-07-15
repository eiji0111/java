public class Main {
  public static void main(String[] args) throws Exception {
    Cleric cleric1 = new Cleric("natsumi", 100, 20);
    System.out.println("HP:" + cleric1.hp + "MP:" + cleric1.mp + "の" + cleric1.name + "が生成されました！");
    Cleric cleric2 = new Cleric("mori");
    System.out.println("HP:" + cleric2.hp + "MP:" + cleric2.mp + "の" + cleric2.name + "が生成されました！");
  }
}