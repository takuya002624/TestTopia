package code12_10;

public class Hero extends Character{

//	public void attack(Matango m) {
//		System.out.println(this.name + "の攻撃！");
//		System.out.println("敵に10ポイントのダメージをあたえた！");
//		m.hp -= 10;
//	}
//
//	public void attack(Goblin g) {
//		System.out.println(this.name + "の攻撃！");
//		System.out.println("敵に10ポイントのダメージをあたえた！");
//		g.hp -= 10;
//	}

	public void attack(Monster mo) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		mo.hp -= 10;
	}
	public void run() {
		System.out.println("逃げ出した！");
	}
}
