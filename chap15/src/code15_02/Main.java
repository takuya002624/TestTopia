package code15_02;

public class Main {

	public static void main(String[] args) {

		String s1 = "Java and JavaScript";

		//一部に"Java"を含むか調べる
		if(s1.contains("Java")) {
			System.out.println("この文字列s1は、Javaを含んでいます");
		}

		//"Java"で終わるか調べる
		if(s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}

		//"Java"が最初に登場する位置を調べる
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		//"Java"を後ろから検索して最初に登場する位置を調べる
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

	}

}
