package practice5;

public class Practice5_4 {

	//結果出力メソッド
	public static void main(String[] args) {
		double bottom = 10.0; //三角形の底辺の長さ
		double height = 5.0; //三角形の高さ
		double radius = 5.0; //円の半径

		//三角形の面積計算メソッド呼び出し
		System.out.println("三角形の底辺の長さが" + bottom +
				"cm、高さが" + height + "の場合、面積は" + calcTriangleArea(bottom, height) + "㎠");

		//円の面積計算メソッド呼び出し
		System.out.println("円の半径が" + radius + "の場合、面積は" + calcCircleArea(radius) + "㎠");

	}

	//三角形の面積計算メソッド
	public static double calcTriangleArea(double bottom, double height) {

		double calcAns = bottom * height / 2;

		return calcAns;

	}

	//円の面積計算メソッド
	public static double calcCircleArea(double radius) {

		double calcAns = radius * radius * 3.14;

		return calcAns;
	}

}
