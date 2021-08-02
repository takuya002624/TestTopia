package code5_06;

public class Main {

	//mainメソッド
	public static void main(String[] args) {
		int x = 100;
		int y = 10;

		st_add("数字を", "足します"); //st_addメソッド呼び出し
		add(x, y); //addメソッド呼び出し
		st_add("数字を", "引きます"); //st_addメソッド呼び出し
		sub(x, y); //subメソッド呼び出し
		st_add("数字を", "掛けます"); //st_addメソッド呼び出し
		mul(x, y); //mulメソッド呼び出し
		st_add("数字を", "割ります"); //st_addメソッド呼び出し
		div(x, y); //divメソッド呼び出し
		st_add("文字を", "足します"); //st_addメソッド呼び出し

	}

	//x + yの足し算addメソッド
	public static void add(int x, int y) {

		int ans = x + y; //mainメソッドブロック内の変数の使用

		System.out.println(x + "+" + y + "=" + ans);
	}

	//x - yの引き算subメソッド
	public static void sub(int x, int y) {

		int ans = x - y; //mainメソッドブロック内の変数の使用

		System.out.println(x + "-" + y + "=" + ans);
	}

	//x * yの掛け算mulメソッド
	public static void mul(int x, int y) {

		int ans = x * y; //mainメソッドブロック内の変数の使用

		System.out.println(x + "*" + y + "=" + ans);
	}

	//x / yの割り算divメソッド
	public static void div(int x, int y) {

		int ans = x / y; //mainメソッドブロック内の変数の使用

		System.out.println(x + "/" + y + "=" + ans);
	}

	//文字列x + yの足し算st_addメソッド
	public static void st_add(String x, String y) {

		String ans = x + y;
		System.out.println(ans);
	}

}
