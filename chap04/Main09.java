public class Main09 {
  public static void main(String[] args) {
    int[][] scores = new int[2][3];
    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < scores[i].length; j++) {
        System.out.println(">");
        scores[i][j] = new java.util.Scanner(System.in).nextInt();
      }
    }
    System.out.println(scores[1][1]);
  }
}
