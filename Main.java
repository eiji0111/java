class Main {
  public static void introduceOneself() {
    String name = "山田太郎";
    int age = 26;
    float height = 164.5F;
    char sex = '男';

    System.out.println("私の名前は" + name + "です。");
    System.out.println("年齢は" + age + "です。");
    System.out.println("身長は" + height + "です。");
    System.out.println("性別は" + sex + "です。");
  }
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました。\n件名：" + title + "\n本文：" + text);
  }
  public static void email(String address, String text) { // emailのオーバーロード
    System.out.println(address + "に、以下のメールを送信しました。\n件名：無題\n本文：" + text);
  }
  public static double calcTriangleArea(double bottom, double height) { // 三角形の面積
    double triangle = (bottom * height) / 2;
    return triangle;
  }
  public static double calcCircleArea(double radius) { // 円の面積
    double circle = (radius * radius) * 3.14;
    return circle;
  }
  public static void main(String[] args) {
    introduceOneself();

    String title = "お見舞い";
    String address = "test@test.com";
    String text = "お久しぶりです。暑い日が続きますが、体調は変わらずお元気ですか？";
    email(title, address, text);
    email(address, text);

    double trianglearea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の底辺の長さが10.0cm、高さが5.0cmの場合、面積は" + trianglearea + "cm^2");
    double circlearea = calcCircleArea(5.0);
    System.out.println("円の半径が5.0cmの場合、面積は" + circlearea + "cm^2");
  }
}