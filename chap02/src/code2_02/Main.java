package code2_02;

public class Main {

	public static void main(String[] args) {
//		System.out.println("私の好きな記号は二重引用符（"）です");    エスケープシーケンスを用いていない(エラー)
		System.out.println("私の好きな記号は二重引用符（\"）です"); //エスケープシーケンスを用いている


		int a = 10;
		int b = 5;
		int c = 7;

		int ans = a + b * c - a - c + 12;

		System.out.println(ans);

		a = 2;

		a += 2 * 3;

		System.out.println(a);
	}

}
