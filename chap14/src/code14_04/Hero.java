package code14_04;

public class Hero {

	private String name;
	private int hp;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	public String toString() {
		return "名前：" + this.getName() + "／HP：" + this.getHp();
	}
}
