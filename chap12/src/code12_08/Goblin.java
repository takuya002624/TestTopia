package code12_08;

public class Goblin implements Monster{

	int hp;
	public void attack(Hero h) {
		System.out.println("ゴブリンの攻撃");
		System.out.println("20のダメージ");
		h.hp -= 20;
	}
	public void run() {
		System.out.println("ゴブリンは逃げ出した！");
	}
}
