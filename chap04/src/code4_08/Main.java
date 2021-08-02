package code4_08;

public class Main {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[5]; //合計の算出←要素数が０からでない
		int avg = sum / scores.length; //平均の算出

		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);


/*		int[] scores = {20, 30, 40, 50, 80};
		int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4]; //合計の算出←要素数が０から始まっている
		int avg = sum / scores.length; //平均の算出

		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg); */

	}

}
