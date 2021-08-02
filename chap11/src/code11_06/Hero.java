package code11_06;

public class Hero extends Character {

	public void atack(Matango m) { //attackではなくatackになっている(オーバーライドになっていない)
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}
}
