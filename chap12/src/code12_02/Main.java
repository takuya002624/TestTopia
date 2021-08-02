package code12_02;

public class Main {

	public static void main(String[] args) {

		Wizard w = new Wizard("アサカ",100,20);
		Matango m = new Matango();

		w.attack(m);
		w.fireball(m);

	}

}
