package code11_09;

public class Main {

	public static void main(String[] args) {
//		Character c = new Character(); //Characterは抽象クラスなので、インスタンス化できない
		Hero h = new Hero("アサカ");
		Dancer d = new Dancer("アサカ");
		Matango m = new Matango('A');

//		c.attack(m);
		d.attack(m);
		d.dance();
	}

}
