package practice4;

public class Practice4_4 {

	public static void main(String[] args) {
		int[] numbers = {3, 4, 9}; //要素数3の配列numbers,3,4,9を代入

		System.out.println("1桁の数字を入力してください");

		int input = new java.util.Scanner(System.in).nextInt(); //数字を入力

		for (int i : numbers) { //配列数分ループで回す
			if (input == i) { //要素と等しい場合、"アタリ！"を出力
				System.out.println("アタリ！");
			}
		}

	}

}
