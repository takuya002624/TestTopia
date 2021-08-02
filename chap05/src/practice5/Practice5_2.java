package practice5;

public class Practice5_2 {

	//出力メソッド
	public static void main(String[] args) {

		//emaiメソッド呼び出し
		email("メールのタイトル", "メールの宛先アドレス", "メールの本文");
	}

	//emaiメソッド
	public static void email(String title, String address, String text) {

		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
}
