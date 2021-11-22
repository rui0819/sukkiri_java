/**
 * じゃんけんゲーム
 * 
 * (1) userName を "あなた"、comName を "わたし" とする。 (2) ユーザーに "gu"、"choki”、"pa"
 * のいずれかを入力させ、それを userHand とする。 (3) ランダムを使って comNum に 0 から 2 の整数のいずれかを入れる。 (4)
 * comNumが0なら"gu"、1なら"choki"、2なら"pa"を comHand とする。 (5) userHand と comHand
 * を画面に表示する。 (6) userHand と comHand を if文で比較して、勝敗を判定し、表示する。
 * "あなたの勝ちです"、"わたしの勝ちです"、"ひきわけです"
 * 
 */
public class Janken {
  public static void main(String[] args) {
    // (1)
    String userName = "あなた";
    String comName = "わたし";

    System.out.println(userName + "さんの手を入力してください");
    System.out.println("gu | choki | pa のいずれかを入力");

    String userHand = new java.util.Scanner(System.in).nextLine();// (2)
    int comNum = new java.util.Random().nextInt(3);// (3)

    String comHand;

    if (comNum == 0) {
      comHand = "gu";
    } else if (comNum == 1) {
      comHand = "choki";
    } else {
      comHand = "pa";
    }
    /*
     * (4)
     */

    // (5)
    System.out.println(userName + ":" + userHand);
    System.out.println(comName + ":" + comHand);

    /*
     * (6)
     */
    if (userHand.equals(comHand)) {
      System.out.println("引き分けです");
    } else if ((userHand.equals("gu") && comHand.equals("choki")) ||

        (userHand.equals("choki") && comHand.equals("pa")) ||

        (userHand.equals("pa") && comHand.equals("gu"))) {
      System.out.println(userName + "の勝ちです");
    } else {
      System.out.println(comName + "の勝ちです");
    }
  }
}
