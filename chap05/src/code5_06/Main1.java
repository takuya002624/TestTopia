package code5_06;

public class Main1 {
	//mainメソッド
	public static void main(String[] args) {
		int x = 100;
		int y = 10;
		int ans; //戻り値格納int型変数
		String str; //戻り値格納String型変数

		str = add("数字を", "足します"); //戻り値String ansのaddメソッド呼び出し
		System.out.println(str);

		ans = add(x, y); //戻り値int ansのaddメソッド呼び出し
		System.out.println(x + "+" + y + "=" + ans);

		str = add("数字を", "引きます"); //戻り値String ansのaddメソッド呼び出し
		System.out.println(str);

		ans = sub(x, y); //戻り値int ansのsubメソッド呼び出し
		System.out.println(x + "-" + y + "=" + ans);

		str = add("数字を", "掛けます"); //戻り値String ansのaddメソッド呼び出し
		System.out.println(str);

		ans = mul(x, y); //戻り値int ansのmulメソッド呼び出し
		System.out.println(x + "×" + y + "=" + ans);

		str = add("数字を", "割ります"); //戻り値String ansのaddメソッド呼び出し
		System.out.println(str);

		ans = div(x, y); //戻り値int ansのdivメソッド呼び出し
		System.out.println(x + "÷" + y + "=" + ans);

		str = add("文字を", "足します"); //戻り値String ansのaddメソッド呼び出し
		System.out.println(str);

	}

	//x + yの足し算addメソッド
	public static int add(int x, int y) {

		int ans = x + y; //mainメソッドブロック内の変数の使用

		return ans;

	}

	//x - yの引き算subメソッド
	public static int sub(int x, int y) {

		int ans = x - y; //mainメソッドブロック内の変数の使用

		return ans;
	}

	//x * yの掛け算mulメソッド
	public static int mul(int x, int y) {

		int ans = x * y; //mainメソッドブロック内の変数の使用

		return ans;
	}

	//x / yの割り算divメソッド
	public static int div(int x, int y) {

		int ans = x / y; //mainメソッドブロック内の変数の使用

		return ans;
	}

	//文字列x + yの足し算addメソッド
	public static String add(String x, String y) {

		String ans = x + y;

		return ans;
	}

}
