package code11_09;

public abstract class Character { //抽象メソッドを使うときは、クラスも抽象クラス(abstract)として宣言する

	String name;
	int hp;

	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

	//戦う
	public abstract void attack(Matango m); //抽象メソッド(abstract)として宣言する

	public Character(String name) {
		this.name = name;
	}
}
