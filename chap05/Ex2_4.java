/**
 * (1) ageString に入れてから age に入れているけれど、 最初から age に整数として入れるようにする。 (2) fortune に
 * 0〜3 の数字を入れてから 1増やしているけれど、 0〜3 のままでいい。 (3) if 文を使って、「あなたの今日の運は 大吉 です」のように
 * 表示されるようにする。if文はJavaScriptやphpと同じように使 ってみてください。String型の un を用意して、fortune が 0
 * なら un は "大吉" になるというふうに。 (4) if文以外にいいやり方があれば、やってみてください。
 */
public class Ex2_4 {
    public static void main(String[] args) {
        showTitle(); // methodの呼び出し
        String name = inputName();// returnで帰ってきた
        int age = inputAge();
        String un = makeforturn();
        endRole(name, age, un);

    } // main end

    public static void endRole(String name, int age, String un) {
        System.out.println("占いの結果が出ました!");
        System.out.print(age + "歳の" + name + "さん、");
        System.out.println("あなたの今日の運は" + un + "です");
    }

    // void 型なし
    public static void showTitle() {
        System.out.println("ようこそ占いの館へ");
    }

    public static String inputName() { // nameというmethodを使う
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        return name; // returnでブロックからだして使えるようにする
    }

    public static int inputAge() {
        System.out.println("あなたの年齢を入力してください");
        int age = new java.util.Scanner(System.in).nextInt();
        return age;
    }

    public static String makeforturn() {
        int forturn = new java.util.Random().nextInt(4);

        String un;

        if (forturn == 0) {
            un = "大吉";
        } else if (forturn == 1) {
            un = "中吉";
        } else if (forturn == 2) {
            un = "吉";
        } else {
            un = "凶";
        }
        return un;
    }

} // class end
