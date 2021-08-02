package code12_08;

public class Main {

	public static void main(String[] args) {

		Matango m = new Matango('A');
		Goblin g = new Goblin();
		Hero h = new Hero("ミナト");


		h.attack(m);
		h.attack(g);

	}

}
