package code10_09;

public class Main {

	public static void main(String[] args) {

		Hero h = new Hero(); //スーパー勇者を生成し初期化
		SuperHero sh = new SuperHero(); //スーパー勇者を生成し初期化
		Matango m = new Matango();

		sh.fly();
		sh.attack(m);
		System.out.println(m.name + "のHP：" + m.hp);
		System.out.println("");

		sh.land();
		sh.attack(m);
		System.out.println(m.name + "のHP：" + m.hp);
		System.out.println("");

	}

}
