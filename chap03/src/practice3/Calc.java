
package practice3;
public class Calc {

	public static void main(String[] args) {
		int a; //左辺の数字
		int b; //右辺の数字
		int c; //加減乗除の選択
		int d; //計算後の数字
		int e; //継続するかどうかの選択
		double f1; //除算用変換変数
		double f2; //除算後の数字

		System.out.println("計算をします");
		do {
			for (;;) {
				System.out.println("以下の数字を選択してください");
				System.out.println("0:加算 1:減算 2:乗算 3:除算 ");
				c = new java.util.Scanner(System.in).nextInt(); //選択の入力

				if (c < 4) { //選択内の数字の場合
					break;
				}
				System.out.println("0～3から選択してください"); //範囲外の数字を選んだ場合
				System.out.println("");
			}

			System.out.println("数字を入力してください");
			a = new java.util.Scanner(System.in).nextInt(); //左辺の数字の入力

			System.out.println("数字を入力してください");
			b = new java.util.Scanner(System.in).nextInt(); //右辺の数字の入力

			switch (c) {
			case 0:
				d = a + b;
				System.out.println("答えは、" + d + "です");
				break;
			case 1:
				d = a - b;
				System.out.println("答えは、" + d + "です");
				break;
			case 2:
				d = a * b;
				System.out.println("答えは、" + d + "です");
				break;
			case 3:
				f1 = a;
				f2 = f1 / b;
				System.out.println("答えは、" + f2 + "です");
				break;
			}
			for (;;) {
				System.out.println("もう一度しますか？ はい:0 いいえ:1");
				e = new java.util.Scanner(System.in).nextInt(); //選択の入力

				if (e < 2) { //選択内の数字の場合
					break;
				}
				System.out.println("0か1より選択してください"); //範囲外の数字を選んだ場合
				System.out.println("");

			}
		} while (e == 0);

		System.out.println("計算を終了します");
	}

}
