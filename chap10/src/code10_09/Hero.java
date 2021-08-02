package code10_09;

public class Hero {

	String name = "ミナト";
	int hp = 100;

	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 10;
		System.out.println("10ポイントのダメージをあたえた！");
	}

	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");

	}
	//転ぶ
	public final void slip() {
		System.out.println(this.name + "は転んだ！");

	}
}
