public class Ex2_3 {
  public static void main(String[] args) {
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力して下さい。");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力して下さい。");
    String ageString = new java.util.Scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);
    int forturn = new java.util.Random().nextInt(4);
    forturn++;
    System.out.println("占い結果が出ました。");
    System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + forturn + "です。");
    System.out.println("1:大吉 2:中吉 3:吉 4:凶");

  }
}