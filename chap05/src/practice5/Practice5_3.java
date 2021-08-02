package practice5;

public class Practice5_3 {

	//出力メソッド
	public static void main(String[] args) {

		//emailメソッド(引数3つ)呼び出し(オーバーロード)
		email("メールのタイトル", "メールの宛先アドレス", "メールの本文");

		//emailメソッド(引数2つ)呼び出し(オーバーロード)
		email("メールの宛先アドレス", "メールの本文");
	}

	//emailメソッド(件名,メールアドレス,本文)
	public static void email(String title, String address, String text) {

		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}

	//emailメソッド(メールアドレス,本文)
	public static void email(String address, String text) {

		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}

}
