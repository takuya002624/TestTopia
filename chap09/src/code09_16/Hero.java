package code09_16;

public class Hero {

	String name;
	int hp;

	public Hero(String name,int hp) { //コントラクタ①
		this.hp = hp;
		this.name = name;
	}

	public Hero() { //コントラクタ②
		this("ダミー",100); //コントラクタ①を呼び出すようJVMに依頼する
	}

}
