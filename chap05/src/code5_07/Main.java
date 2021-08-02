package code5_07;

public class Main {

	//戻り値x + y のaddメソッド
	public static int add(int x, int y) {
		int ans = x + y;

		System.out.println("addを呼び出し");
		return ans; //ans を戻り値として返す
	}

	//mainメソッド
	public static void main(String[] args) {

		int ans = add(100, 10); //addメソッドを呼び出し

		System.out.println("100 + 10 = " + ans);

	}

}
