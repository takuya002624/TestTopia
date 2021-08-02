package code10_08;

public class SuperHero extends Hero {

	boolean flying; //追加したflying

	//追加したfly()
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");

	}

	//追加したland()
	public void land() {
		this.flying = false;
		System.out.println("着地した！");

	}
	//逃げる：親クラスにも定義してあるが、子クラスで再定義(上書き)するメソッド
	public void run() {
		System.out.println(this.name + "は撤退した！");

	}

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
		if(this.flying) {
			System.out.println(this.name + "の攻撃！");
			m.hp -= 5;
			System.out.println("5ポイントのダメージをあたえた！");
			System.out.println("2回攻撃した！");
		}
	}

}
