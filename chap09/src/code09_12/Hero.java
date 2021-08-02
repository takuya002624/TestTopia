package code09_12;

public class Hero {

	String name;
	int hp;

	public Hero(String name) {	//引数として文字列を受け取るコントラクタ①
		this.hp = 100;
		this.name = name; //引数の値でnameフィールドを初期化
	}

	public Hero() {	//引数なしのコントラクタ②
		this.hp = 100;
		this.name = "ダミー"; 
	}


}
