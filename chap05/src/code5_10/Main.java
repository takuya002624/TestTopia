package code5_10;

public class Main {

	//1つ目のint型addメソッド
	public static int add(int x, int y) {
		return x + y;
	}

	//2つ目のdouble型addメソッド
	public static double add(double x, double y) {
		return x + y;
	}

	//3つ目のString型addメソッド
	public static String add(String x, String y, String z) {
		return x + y + z;
	}

	//mainメソッド
	public static void main(String[] args) {

		//1つ目のaddメソッド呼び出し
		System.out.println(add(10, 20));

		//2つ目のaddメソッド呼び出し
		System.out.println(add(3.5, 2.7));

		//3つ目のaddメソッド呼び出し
		System.out.println(add("hello"," ", "World"));
	}

}
