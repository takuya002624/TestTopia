package code12_10;

public class DeathBat extends Monster{

	public void attack(Hero h) {
		System.out.println("地獄コウモリの攻撃");
		System.out.println("10のダメージ");
		h.hp -= 20;
	}
	public void run() {
		System.out.println("地獄コウモリは、羽ばたいて逃げ出した！");
	}
}
