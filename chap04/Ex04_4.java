public class Ex04_4 {
  public static void main(String[] args) {
    int[] numbers = { 3, 4, 9 };
    System.out.println("一桁の数字を入力して下さい");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int number : numbers) {
      if (input == number) {
        System.out.println("アタリ！");
      }
    }
  }
}
