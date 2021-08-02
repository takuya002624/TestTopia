package code09_03;

public class Hero {

	//Heroクラスを定義しておく
	String name;
	int hp;
	int damage;
	Sword sword;	//勇者が装備している剣の情報

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
}
