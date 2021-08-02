package code12_10;

public class Slime extends Monster{


	public void attack(Hero h) {
		System.out.println("スライムの攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}

	public void run() {
		System.out.println("スライムは、体をうねらせて逃げ出した！");
	}
}
