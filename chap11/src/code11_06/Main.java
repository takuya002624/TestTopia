package code11_06;

public class Main {

	public static void main(String[] args) {
		Character c = new Character(); //継承の材料として使うべきなのに、インスタンス化してしまっている
		Hero h = new Hero();
		Matango m = new Matango('A');

		c.attack(m);
	}

}
