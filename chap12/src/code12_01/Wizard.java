package code12_01;

public class Wizard implements Life{

	String name;
	int hp;

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public Wizard(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}
}
