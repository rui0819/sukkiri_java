public class Ex3_6 {
  public static void main(String[] args) {
    System.out.println("【数あてゲーム】");
    int ans = new java.util.Random().nextInt(50);
    for (int i = 0; i < 5; i++) {
      System.out.println("0 ~ 49の数字を入力して下さい");
      int num = new java.util.Scanner(System.in).nextInt();
      if (num == ans) {
        System.out.println("アタリ");
        break;
      } else if (num > ans) {
        System.out.println("大きすぎます");
      } else {
        System.out.println("小さすぎます");
      }
      System.out.println("ゲームを終了します");
    }

  }

}
