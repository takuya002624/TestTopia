package code14_12;

public class Hero {

	private String name;
	private int hp;
	static int money;


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

	public static void setRandamMoney() {
		Hero.money = (int)(Math.random() * 1000);
//		System.out.println(this.getName() + "たちの所持金を初期化しました。");
	}

	public Hero(String name,int hp) {
		this.setName(name);
		this.setHp(hp);
	}
}
