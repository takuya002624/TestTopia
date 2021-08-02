package code2_15;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("1つ目の数字を入力してください");
		int a = new java.util.Scanner(System.in).nextInt(); //1つ目の数字

		System.out.println("2つ目の数字を入力してください");
		int b = new java.util.Scanner(System.in).nextInt(); //2つ目の数字

		int c = a + b; //合計

		System.out.println("計算結果を表示します");
		System.out.println(a + "+" + b + "=" + c);

	}

}
