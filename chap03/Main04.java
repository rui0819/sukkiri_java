public class Main04 {
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        if (j == 3) {
          continue;
        }
        if (i * j < 10) {
          System.out.print(" ");
        }
        System.out.print(i * j);
        System.out.print(" ");
      }
      System.out.println("|");
    }
  }
}
