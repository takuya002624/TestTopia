package code10_01;

public class Main {

	public static void main(String[] args) {

		Hero h = new Hero(); //勇者を生成し初期化

		Matango m = new Matango();	//お化けキノコを生成し初期化

		h.attack(m); //攻撃
		h.run(); //逃げる

		System.out.println(h.name + "の現在のHP" + h.hp);
	}

}
