package code5_12;

public class Main {

	//int型配列を受け取り、すべての要素を表示するメソッド
	public static void printArray(int[] array) { //引数に配列型を指定

		for (int element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3 };

		//配列型を渡す
		printArray(array);

	}

}
