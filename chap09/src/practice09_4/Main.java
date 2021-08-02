package practice09_4;

public class Main {

	public static int heal(int hp) {
		hp += 10;

		return hp;
	}

	public static void heal(Thief thief) {
		thief.hp += 10;
	}

	public static void main(String[] args) {

		int baseHp = 25;

		Thief t = new Thief("アサカ",baseHp);

		System.out.println(baseHp + ":" + t.hp);

		baseHp = heal(baseHp);
		heal(t);
		System.out.println(baseHp + ":" + t.hp);
	}

}
