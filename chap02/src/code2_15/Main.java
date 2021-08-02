package code2_15;

public class Main {

	public static void main(String[] args) {
		System.out.println("あなたの名前を入力してください。");

		String name = new java.util.Scanner(System.in).nextLine(); //入力された文字列を戻り値として、左辺の変数に代入

		System.out.println("あなたの年齢を入力してください。");

		int age = new java.util.Scanner(System.in).nextInt(); //入力された数値を戻り値として、左辺の変数に代入

		System.out.println("ようこそ" + age + "歳の" + name + "さん。");

	}

}
