package code12_10;

public class Goblin extends Monster{


	public void attack(Hero h) {
		System.out.println("ゴブリンの攻撃");
		System.out.println("20のダメージ");
		h.hp -= 20;
	}
	public void run() {
		System.out.println("ゴブリンは、腕をふって逃げ出した！");
	}
}
