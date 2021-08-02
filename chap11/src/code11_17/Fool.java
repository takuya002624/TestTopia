package code11_17;

public class Fool extends Character implements Human {


	//Charactar から hp やname などのフィールドを継承している
	//Charactar から継承した抽象メソッド attack() を実装
	public void attack(Matango m) {

		System.out.println(this.name + "は戦わずに遊んでいる");
	}

	//さらにHuman から継承した4つの抽象メソッドを実装
	public void talk() {

	}

	public void watch() {

	}

	public void hear() {

	}

	public void run() {

	}
}
