public class Ex3_3 {
  public static void main(String[] args) {
    int isHungry = 1;
    String food = "ブロッコリー";
    System.out.println("こんにちは");
    String msg = (isHungry == 0) ? "お腹いっぱいです" : "腹ペコです";
    System.out.println(msg);

    // if (isHungry == 0) {
    // System.out.println("お腹いっぱいです");
    // } else {
    // System.out.println("はらぺこです");
    if (isHungry == 1) {
      System.out.println(food + "いただきます");
      System.out.println("ごちそうさまでした");
    }
  }
}
