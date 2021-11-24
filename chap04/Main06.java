public class Main06 {
  public static void main(String[] args) {
    int[] scores;
    scores = new int[5];
    String[] kamoku = { "算数", "国語", "理科", "英語", "社会" };// 省略記法
    // 要素の型[] 配列変数名 = new 要素の型[] {値１,値２,値３,......};
    // 要素の型[] 配列変数名 = {値１,値２,値３,......};

    scores[0] = 23;
    scores[1] = 34;
    scores[2] = 45;
    scores[3] = 55;
    scores[4] = 65;

    int i = 0;

    for (int value : scores) {
      System.out.println(kamoku[i] + ":" + value);
      i++;
    }
  }
}
