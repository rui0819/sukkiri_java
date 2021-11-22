public class Main02 {
  public static void main(String[] args) {
    System.out.print(">");
    String ok = new java.util.Scanner(System.in).nextLine();

    while (ok.equals("no")) {
      System.out.println("ノックする");
      System.out.print(">");
      ok = new java.util.Scanner(System.in).nextLine();
      System.out.println("1分待つ");
    }

    System.out.println("トイレが空きました");
  }
}