package practice2;

public class Practice2_2 {

	public static void main(String[] args) {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine(); //名前入力

		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine(); //年齢入力
		int age = Integer.parseInt(ageString); //String型からint型に変換

		int fortune = new java.util.Random().nextInt(4); //0_3までの乱数生成
		fortune++; //1_4の乱数に変換

		System.out.println("占いの結果が出ました！"); //結果表示
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉2:中吉3:吉4:凶");

	}

}
