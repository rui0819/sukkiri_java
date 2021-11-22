public class Main02 {
  public static void main(String[] args) {
    int hun = 0;
    boolean doorClose = true;
    while (doorClose == true) {
      System.out.println("ノックする");
      System.out.println("1分待つ");
      hun++;
      if (hun > 9) {
        break;
      }
      System.out.println("トイレが空きました");
    }
  }
}
