package code12_02;

public abstract class Character {

	String name;
	int hp;

	public Character(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void run() {
	}

	public abstract void attack(Matango m);
}
