package code10_02;

public class Main {

	public static void main(String[] args) {

		Hero h = new Hero(); //勇者を生成し初期化
		SuperHero s = new SuperHero(); //スーパー勇者を生成し初期化

		Matango m = new Matango();	//お化けキノコを生成し初期化

		s.attack(m); //攻撃
		s.run(); //逃げる

		System.out.println(s.name + "の現在のHP" + s.hp);
	}

}
