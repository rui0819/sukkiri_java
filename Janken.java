/**
 * じゃんけんゲーム
 * 
 * (1) userName を "あなた"、comName を "わたし" とする。
 * (2) ユーザーに "gu"、"choki”、"pa" のいずれかを入力させ、それを
 *   userHand とする。
 * (3) ランダムを使って comNum に 0 から 2 の整数のいずれかを入れる。
 * (4) comNumが0なら"gu"、1なら"choki"、2なら"pa"を comHand とする。
 * (5) userHand と comHand を画面に表示する。
 * (6) userHand と comHand を if文で比較して、勝敗を判定し、表示する。
 *     "あなたの勝ちです"、"わたしの勝ちです"、"ひきわけです"
 * 
 */
public class Janken {
    public static void main(String[] args) {
        // (1)
        String userName = "あなた";
        String comName = "わたし";

        System.out.println(userName + "さんの手を入力してください");
        System.out.println("gu | choki | pa のいずれかを入力");

        String userHand =  ("0:gu 1:choki 3:pa");// (2)
        int comNum =  // (3)
        /*
          (4)
        */

        // (5)
        System.out.println(userName + ":" + userHand);
        System.out.println(comName + ":" + comHand);

        /*
          (6)
        */

    }
}
