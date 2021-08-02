package code15_03;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java programing";

		//指定位置から始まる文字列を最後まで切り出す(引数が1つのため)
		System.out.println("文字列s1の4番目以降は" + s1.substring(3));

		//指定位置から始まる文字列を任意の長さだけ切り出す(引数が2つのため)
		//2つ目の引数は、指定した位置の1つ前までを切り出す
		System.out.println("文字列s1の4~8番目以降は" + s1.substring(3,8));

	}

}
