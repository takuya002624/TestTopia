package code10_03;

public class Main {

	public static void main(String[] args) {

		SuperHero sh = new SuperHero(); //スーパー勇者を生成し初期化

		Matango m = new Matango();	//お化けキノコを生成し初期化

		sh.attack(m); //攻撃
		sh.run(); //逃げる

		System.out.println(sh.name + "の現在のHP" + sh.hp);
	}

}
