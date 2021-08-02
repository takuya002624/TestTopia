package code5_08;

public class Main {

	//addメソッド
	public static int add(int x, int y) {

		int ans = x + y;
		System.out.println(ans);

		return ans;
	}

	//mainメソッド
	public static void main(String[] args) {

		System.out.println(add(add(10, 20), add(30, 40)));

		/*	add(ans = 10 + 20 , ans = 30 + 40)
			add(30, 70)
			ans = 30 + 70
		*/

	}

}
