package code5_03;

public class Main {

	//methodAメソッド
	public static void methodA() {
		System.out.println("methodA");

		methodB(); //methodBメソッド呼び出し
	}

	//methodBメソッド
	public static void methodB() {
		System.out.println("methodB");
	}

	//mainメソッド
	public static void main(String[] args) {

		methodA(); //methodAメソッド呼び出し
	}

}
