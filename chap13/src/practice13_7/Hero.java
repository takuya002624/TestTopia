package practice13_7;

public class Hero {

	private int hp; //自身のクラスのみ
	private String name;



	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() { //名前の呼び出しgetterメソッド
		return this.name;
	}

	public void setName(String name) { //名前を設定するsetterメソッド
		if(name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断。");
		}
		if(name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}
		if(name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
		}
		this.name = name;
	}

	public Hero(String name,int hp) {

		this.setName(name);
		this.setHp(hp);
	}

}
