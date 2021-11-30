public class calc2 {
  public static void main(String[] args) {
    int num = inputNum("1つめの数字を入力>");
    int num = inputNum("2つめの数字を入力>");
    System.out.println("+ - × / を入力");
    calculator(num1, num2, mode);
  }

  public static int inputNum(String text) {
    System.out.print(text);
    int num = java.util.Scanner(System.in).nextInt();
    return num;
  }

  public static int inputNum(String text) {
    System.out.print(text);
    int num = new java.util.Scanner(System.in).nextInt();
  }

public static void calculator(int num, int num2, char mode) {
  int ans = 0;
  switch (mode){
    case '+':
    ans = num1 + num2;
    break;
    case '-':
    ans = num1 - num2;
    break;
    case '×':
    ans = num1 * num2;
    break;
    case '/':
    ans = num1 / num2;
    break;
    default;
    System.exit(1);
  }
  System.out.println(num1 + " " + mode);
}
}
