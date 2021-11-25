public class Main10 {
  public static void main(String[] args) {
    int[][] scores = { { 40, 50, 60 }, { 80, 60, 70 }, { 30, 20, 40 } };
    for (int i = 0; i < scores.length; i++) // 人の数
      for (int j = 0; j < scores[i].length; j++) { // 科目数
        System.out.print(scores[i][j]);
        if (j < 2) {
          System.out.print(",");
        }
      }
    System.out.println();
  }
}