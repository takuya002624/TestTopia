package code09_05;

public class Wizard {

	String name;
	int hp;

	public void heal(Hero h) {
		int nowHp = h.hp;
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
		System.out.println(h.name + "の現在のHP：" + nowHp + "→" + h.hp);
		System.out.println("");
	}
}
