package code5_11;

public class Main {

	//1つ目の仮引数2つのaddメソッド
	public static int add(int x, int y) {

		return x + y;
	}

	//2つ目の仮引数3つのaddメソッド
	public static int add(int x, int y, int z) {

		return x + y + z;
	}

	public static void main(String[] args) {

		//1つ目のaddメソッド呼び出し
		System.out.println("10+20=" + add(10, 20));

		//1つ目のaddメソッド呼び出し
		System.out.println("10+20+30=" + add(10, 20, 30));

	}

}
