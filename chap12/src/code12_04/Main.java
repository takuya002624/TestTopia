package code12_04;

public class Main {

	public static void main(String[] args) {

		Wizard w = new Wizard("アサカ",100,20);
		Character c = w;
		Matango m = new Matango();


		c.name = "アサカ";
		c.attack(m);
//		c.fireball(m);

	}

}
