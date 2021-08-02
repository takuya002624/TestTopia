package code11_07;

public class Hero extends Character {

	public void atack(Matango m) { //attackではなくatackになっている(オーバーライドになっていない)
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}

	public void attack(Matango m) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
