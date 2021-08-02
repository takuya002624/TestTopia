package code5_13;

public class Main {

	//int型配列を受け取り、配列内の要素すべてに1を加えるメソッド
	static void incArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	//結果をreturnで返していない

	//mainメソッド
	public static void main(String[] args) {

		int[] array = { 1, 2, 3 };

		//incArrayメソッド呼び出し
		incArray(array);

		for (int i : array) {
			System.out.println(i);
		}

	}

}
