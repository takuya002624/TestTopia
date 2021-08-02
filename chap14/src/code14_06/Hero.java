package code14_06;

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

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Hero) {
			Hero h = (Hero) o;
			if (this.getName().equals(h.getName())) {
				return true;
			}
		}
		return false;
	}

	public Hero(String name,int hp) {
		this.setName(name);
		this.setHp(hp);
	}
}
