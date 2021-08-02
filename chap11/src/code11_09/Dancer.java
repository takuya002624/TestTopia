package code11_09;

public class Dancer extends Character{	//Characterは抽象クラス

	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}

	public void attack(Matango m) {	//attack()メソッドは抽象メソッドなのでオーバーライドしなければならない
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に3ポイントのダメージ！");
		m.hp -= 3;
	}

	public Dancer(String name) {
		super(name);
	}

}
