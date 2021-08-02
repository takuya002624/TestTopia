package code09_16;

public class Main {

	public static void main(String[] args) {

		Hero h1 = new Hero("ミナト",100); //文字列引数があるのでコントラクタ①が呼び出される
		System.out.println(h1.name);

		Hero h2 = new Hero(); //引数がないのでコントラクタ②が呼び出される
		System.out.println(h2.name);
	}

}
