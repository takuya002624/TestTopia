package practice5;

public class Practice5_1 {

	//出力メソッド
	public static void main(String[] args) {

		introduceOneself(); //自己紹介メソッド呼び出し
	}

	//自己紹介メソッド
	public static void introduceOneself() {

		String name = "湊"; //名前
		int age = 20; //年齢
		double height = 175.0; //身長
		char twelve = '蛇'; //十二支

		System.out.println("私の名前は、" + name + "です。");
		System.out.println("年齢は、" + age + "歳です。");
		System.out.println("身長は、" + height + "cmで、");
		System.out.println("十二支は、" + twelve + "です。");

	}

}
