package code2_14;

public class Main {

	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(90); //ランダムな整数を生成して、戻り値を左辺の変数に代入

		System.out.println("あなたはたぶん、" + r + "ですね？");

		int d = new java.util.Random().nextInt(6) + 1;

		System.out.println("サイコロを振ります");
		System.out.println("出た目は" + d + "です");

	}

}
